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
public class GameAutoBean {
    private String name = "Bus simulator" ;
    private int duration = 48;
}