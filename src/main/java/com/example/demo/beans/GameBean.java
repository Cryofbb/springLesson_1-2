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
public class GameBean {
    private String name;
    private int duration;
}