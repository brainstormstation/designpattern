package com.designpattern.singleton;

public class SingLazySync {
    private static SingLazySync INSTANCE;

    private SingLazySync() {}

    public static synchronized SingLazySync getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            INSTANCE = new SingLazySync();
        }
        return INSTANCE;
    }
    
}
