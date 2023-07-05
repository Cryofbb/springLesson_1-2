package com.example.demo.autobeans;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class MovieAutoBean {
    private String name = "FastFurious";
    private int duration = 240;
}