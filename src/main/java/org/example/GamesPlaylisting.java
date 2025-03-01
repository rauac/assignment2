package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("games")
@Component
public class GamesPlaylisting implements Playlisting{
    @Override
    public void addToPlaylist(Video video) {
        System.out.println("Adding to games playlist...");
    }
}
