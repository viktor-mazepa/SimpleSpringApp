package com.mazasoft.springcourse.player.music.impl;

import com.mazasoft.springcourse.player.music.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class RockMusic implements Music {
    public List<String> getSongs() {
        return new ArrayList<String>() {{
            add("Bring me to life");
            add("Toxycity");
            add("Sonne");
        }};
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("ClassicalMusic: Do my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("ClassicalMusic: Do my destruction");
    }

    @Override
    public String getSong() {
        return "Bring me to life";
    }
}
