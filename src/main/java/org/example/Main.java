package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Eager created");
        VideoService videoService = context.getBean(VideoService.class);
        VideoService gamingVideoServ = context.getBean("gamingvideo",VideoService.class);

        Video newvideo = new Video();
        newvideo.setName("New Video");
        newvideo.setType("education");
        newvideo.setUrl("https://www.youtube.com/watch?v=VdMxjF7_RBQ");
        newvideo.setAuthor("Azamat Ordabekov");
        videoService.pushVideo(newvideo);
    }
}