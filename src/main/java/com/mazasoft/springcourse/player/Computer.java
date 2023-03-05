package com.mazasoft.springcourse.player;

import com.mazasoft.springcourse.player.music.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id = " + id +
                ", player name = " + musicPlayer.getName() +
                ", music = " + musicPlayer.playMusic(Style.ROCK) +
                ", volume = " + musicPlayer.getVolume() +
                '}';
    }
}
