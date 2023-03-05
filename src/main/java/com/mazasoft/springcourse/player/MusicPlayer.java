package com.mazasoft.springcourse.player;

import com.mazasoft.springcourse.player.music.Music;
import com.mazasoft.springcourse.player.music.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;

    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {
    }

    public String playMusic(Style style) {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        switch (style){
            case ROCK: return music2.getSongs().get(randomNumber);
            case CLASSICAL: return music1.getSongs().get(randomNumber);
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
