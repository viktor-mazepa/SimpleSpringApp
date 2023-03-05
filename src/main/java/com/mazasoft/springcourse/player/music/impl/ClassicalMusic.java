package com.mazasoft.springcourse.player.music.impl;

import com.mazasoft.springcourse.player.music.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
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

    public List<String> getSongs() {
        return new ArrayList<String>() {{
            add("Hungarian Rhapsody");
            add("Bethoven Symphony #5");
            add("Chaykovsky Symphony#1");
        }};
    }

    private int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
