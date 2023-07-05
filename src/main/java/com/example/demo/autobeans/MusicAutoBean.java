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
public class MusicAutoBean {
    private String name = "Autodog";
    private int duration = 14;
}