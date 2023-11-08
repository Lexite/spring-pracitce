package edu.javacourse.Music;

import org.springframework.stereotype.Component;

@Component
public class TechnoMusic implements Music{

    @Override
    public String getSong() {
        return "Playing techno music";
    }
}
