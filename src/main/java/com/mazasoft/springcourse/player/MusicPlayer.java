package com.mazasoft.springcourse.player;

import com.mazasoft.springcourse.player.music.Music;
import com.mazasoft.springcourse.player.music.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
    private Music music1;

    @Autowired
    @Qualifier("rockMusic")
    private Music music2;

    @Autowired
    private Random random;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    List<Music> musicList;

    @Autowired
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return musicList.get(random.nextInt(musicList.size())).getSong();
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
