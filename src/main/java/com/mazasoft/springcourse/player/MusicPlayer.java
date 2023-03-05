package com.mazasoft.springcourse.player;

import com.mazasoft.springcourse.player.music.Music;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MusicPlayer {
    private List<Music> music  = new ArrayList<Music>();

    private String name;

    private int volume;

    //IoC
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        music.forEach(new Consumer<Music>() {
            public void accept(Music music) {
                System.out.println("Playing: " + music.getSong());
            }
        });

    }

    // DI via setter
    public void setMusic(List<Music> music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
