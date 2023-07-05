package com.example.demo.apps;

import com.example.demo.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class JavaContextApp {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ApplicationContext context = new AnnotationConfigApplicationContext(MyJavaConfiguration.class);
            System.out.println("1 - Listen music");
            System.out.println("2 - Watch movie");
            System.out.println("3 - Play game");
            String data = sc.next();

            switch (data.charAt(0)) {
                case '1' -> {
                    MusicBean myBeanJava = context.getBean(data, MusicBean.class);
                    System.out.println(myBeanJava.getName() + " Duration: " + myBeanJava.getDuration());
                }
                case '2' -> {
                    MovieBean myBeanJava = context.getBean(data, MovieBean.class);
                    System.out.println(myBeanJava.getName() + " Duration: " + myBeanJava.getDuration());
                }
                case '3' -> {
                    GameBean myBeanJava = context.getBean(data, GameBean.class);
                    System.out.println(myBeanJava.getName() + " Duration: " + myBeanJava.getDuration());
                }
            }



    }
}
