package com.mazasoft.springcourse.player.music.impl;

import com.mazasoft.springcourse.player.music.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Blinding lights";
    }
}
