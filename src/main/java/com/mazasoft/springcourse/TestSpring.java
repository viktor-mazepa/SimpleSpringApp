package com.mazasoft.springcourse;

import com.mazasoft.springcourse.player.Computer;
import com.mazasoft.springcourse.player.MusicPlayer;
import com.mazasoft.springcourse.player.music.Music;
import com.mazasoft.springcourse.player.music.impl.ClassicalMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    private static String APPLICATION_CONTEXT_FILE_NAME = "applicationContext.xml";
    private static String CLASSICAL_MUSIC_BEAN_NAME = "classicalMusicBean";
    private static String ROCK_MUSIC_BEAN_NAME = "rockMusicBean";
    private static String MUSIC_PLAYER_BEAN_NAME = "musicPlayer";

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT_FILE_NAME);
       /* Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();*/
/*
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer.toString());
        context.close();
    }
}
