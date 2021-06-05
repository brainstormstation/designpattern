package com.designpattern.singleton;

import org.junit.Test;

/**
 * Lazy loading with synchronized.
 * Thread safe but bad performance.
 */
public class SingLazySyncTest {
    
    @Test
    public void testSinLazySync() {
        for (int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(SingLazySync.getInstance().hashCode());
            }).start();
        }        
    }
}
