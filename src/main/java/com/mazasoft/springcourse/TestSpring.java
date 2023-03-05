package com.mazasoft.springcourse;

import com.mazasoft.springcourse.player.Computer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    private static String CLASSICAL_MUSIC_BEAN_NAME = "classicalMusicBean";
    private static String ROCK_MUSIC_BEAN_NAME = "rockMusicBean";
    private static String MUSIC_PLAYER_BEAN_NAME = "musicPlayer";

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
