package com.designpattern.singleton;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SingHungryTest {

    @Test
    public void testSingletonInstance() {
        SingHungery s1 = SingHungery.getInstance();
        SingHungery s2 = SingHungery.getInstance();
        assertTrue(s1 == s2);
    }
    
}
