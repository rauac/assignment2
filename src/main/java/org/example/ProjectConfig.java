package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Lazy
    VideoService gamingvideo(VideoRepository videoRepository,@Qualifier("games") Playlisting playlisting){
        return new VideoService(videoRepository, playlisting);
    }
}
