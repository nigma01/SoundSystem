package com.spring.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by David on 03/05/2015.
 */

@Component
public class SgtPepper implements CompactDisc {

    private String title = "Sgt Peppers";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("The song is " + title + " by " + artist);
    }

}
