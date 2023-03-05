package com.mazasoft.springcourse;

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
        /*   Music music = context.getBean(CLASSICAL_MUSIC_BEAN_NAME, Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        music = context.getBean(ROCK_MUSIC_BEAN_NAME, Music.class);
        musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();*/

        MusicPlayer firstMusicPlayer = context.getBean(MUSIC_PLAYER_BEAN_NAME, MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean(MUSIC_PLAYER_BEAN_NAME, MusicPlayer.class);
        firstMusicPlayer.setVolume(10);
        firstMusicPlayer.playMusic();

        System.out.println("Name = " + firstMusicPlayer.getName());
        System.out.println("Volume = " + firstMusicPlayer.getVolume());

        System.out.println("Name = " + secondMusicPlayer.getName());
        System.out.println("Volume = " + secondMusicPlayer.getVolume());

        boolean isTheSame = firstMusicPlayer == secondMusicPlayer;

        System.out.println("isTheSame = " + isTheSame);

        context.close();
    }
}
