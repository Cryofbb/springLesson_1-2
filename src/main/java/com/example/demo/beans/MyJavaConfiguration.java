package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MyJavaConfiguration {
    @Bean("1")
    public MusicBean getMusic() {
        return new MusicBean("Music", 24);
    }
    @Bean("2")
    public MovieBean getMovie() {
        return new MovieBean("Movie", 140);
    }
    @Bean("3")
    public GameBean getGame() {
        return new GameBean("Game", 12);
    }
}
