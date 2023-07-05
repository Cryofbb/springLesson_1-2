package com.example.demo.beans;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class MusicBean {
    private String name = "dog";
    private int duration = 14;
}