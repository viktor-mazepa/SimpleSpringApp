package com.mazasoft.springcourse.player.music.impl;

import com.mazasoft.springcourse.player.music.Music;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("ClassicalMusic: Do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("ClassicalMusic: Do my destruction");
    }

    public String getSong() {
        return "Hungarian Rhapsody";
    }


}
