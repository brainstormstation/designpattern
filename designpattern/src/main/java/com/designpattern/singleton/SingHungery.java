package com.designpattern.singleton;

/**
 * 饿汉模式
 * 类加载到内存后， 就仅仅实例化一个单例
 * 缺点：类在加载的时候就已经完成实例化
 */
public class SingHungery {
    private static final SingHungery INSTANCE = new SingHungery();

    private SingHungery() {}

    public static SingHungery getInstance() {
        return INSTANCE;
    }    
}
