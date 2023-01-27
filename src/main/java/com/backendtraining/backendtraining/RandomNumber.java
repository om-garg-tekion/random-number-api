package com.backendtraining.backendtraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomNumber {

    @GetMapping("/")
    public int getRandomNumber(){
        int num = (int) (Math.random()*10);
        return num;
    }
}
