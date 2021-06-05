package com.designpattern.singleton;

/**
 * 懒汉式
 * 当类被使用的时候才会被初始化。
 * 缺点：不是线程安全的。
 */
public class SingLazy {
    private static SingLazy INSTANCE;

    private SingLazy() {}

    public static SingLazy getInstance() {
        if (INSTANCE == null) {
            // The following code is only for simulating the multi thread scenario
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            INSTANCE = new SingLazy();
        }
        return INSTANCE;
    }
}
