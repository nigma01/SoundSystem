package com.spring.soundsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by David on 03/05/2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {

    @Autowired
    private  CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
}
