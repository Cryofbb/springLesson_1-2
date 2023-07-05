package com.example.demo.apps;

import com.example.demo.autobeans.GameAutoBean;
import com.example.demo.autobeans.MovieAutoBean;
import com.example.demo.autobeans.MusicAutoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@ComponentScan("com.example.demo")
public class AutoConfigurationContextApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Listen music");
        System.out.println("2 - Watch movie");
        System.out.println("3 - Play game");
        String data = sc.next();
        ApplicationContext context = new AnnotationConfigApplicationContext(AutoConfigurationContextApp.class);
        switch (data.charAt(0)) {
            case '1' -> {
                MusicAutoBean gb = context.getBean("musicAutoBean", MusicAutoBean.class);
                System.out.println("Name: " + gb.getName() + " & duration : " + gb.getDuration());
            }
            case '2' -> {
                MovieAutoBean gb = context.getBean("movieAutoBean", MovieAutoBean.class);
                System.out.println("Name: " + gb.getName() + " & duration : " + gb.getDuration());
            }
            case '3' -> {
                GameAutoBean gb = context.getBean("gameAutoBean", GameAutoBean.class);
                System.out.println("Name: " + gb.getName() + " & duration : " + gb.getDuration());
            }
        }
    }
}