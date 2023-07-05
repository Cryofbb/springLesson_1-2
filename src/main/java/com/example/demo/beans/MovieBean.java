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
public class MovieBean {
    private String name;
    private int duration;
}