package com.spring.soundsystem;

/**
 * Created by David on 03/05/2015.
 */


public class SgtPepper implements CompactDisc {

    private String title = "Sgt Peppers";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("The song is " + title + " by " + artist);
    }

}
