package com.spring.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by David on 03/05/2015.
 */
@Configuration
public class CdPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPepper();
    }


    @Bean
    public CdPlayer cdPlayer(){
        return new CdPlayer(sgtPeppers());
    }
    /*
    @Bean
    public CdPlayer cdPlayer(CompactDisc compactDisc){
        CdPlayer cdPlayer1 = new CdPlayer(compactDisc);
        cdPlayer1.setCompactDisc(compactDisc);
    }
    */
}
