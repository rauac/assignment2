package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Qualifier("education")
@Component
public class EducationPlaylisting implements Playlisting{
    @Override
    public void addToPlaylist(Video video) {
        System.out.println("Adding to education playlist...");
    }
}
