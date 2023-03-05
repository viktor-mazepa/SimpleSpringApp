package com.mazasoft.springcourse.player.music.impl;

import com.mazasoft.springcourse.player.music.Music;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Blinding lights";
    }

    @Override
    public List<String> getSongs() {
        return null;
    }
}
