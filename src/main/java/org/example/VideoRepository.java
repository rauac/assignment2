package org.example;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class VideoRepository implements RepositoryInt {
    private HashMap<String, Video> videos;

    public VideoRepository() {
        this.videos = new HashMap<>();
    }
    @Override
    public void storeVideo(Video video) {
        videos.put(video.getAuthor(), video);
        System.out.println("Stored video: " + video);
    }
}
