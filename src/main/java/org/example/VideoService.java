package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service
public class VideoService {
    private final RepositoryInt videoRepository;
    private final Playlisting playlisting;

    @Autowired
    public VideoService(RepositoryInt videoRepository,@Qualifier("education") Playlisting playlisting) {
        this.videoRepository = videoRepository;
        this.playlisting = playlisting;
    }
    public void pushVideo(Video video) {
        System.out.println("publishing video "+video.getUrl()+" by "+video.getAuthor());
        videoRepository.storeVideo(video);
        playlisting.addToPlaylist(video);
    }
}
