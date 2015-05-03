package com.spring.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by David on 03/05/2015.
 */


public class CdPlayer implements MediaPlayer {

    private CompactDisc cd;

    @Autowired
    public CdPlayer(CompactDisc cd) {
        this.cd = cd;
    }


    @Override
    public void play() {
        cd.play();
    }
}
