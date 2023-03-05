package com.mazasoft.springcourse;

import com.mazasoft.springcourse.player.music.Music;
import com.mazasoft.springcourse.player.music.impl.ClassicalMusic;
import com.mazasoft.springcourse.player.music.impl.PopMusic;
import com.mazasoft.springcourse.player.music.impl.RockMusic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
@ComponentScan("com.mazasoft.springcourse.player")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Autowired
    ClassicalMusic classicalMusic;
    @Autowired
    RockMusic rockMusic;
    @Autowired
    PopMusic popMusic;

    @Bean
    public Random random() {
        return new Random();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic, rockMusic, popMusic);
    }
}
