package com.designpattern.singleton;

import org.junit.Test;

public class SingEnumTest {
    
    @Test
    public void testMultiThread() {
        for (int i=0; i<100; i++) {
            new Thread(() -> {
                System.out.println(SingEnum.INSTANCE.hashCode());
            }).start();
        }
    }
}
