package com.designpattern.singleton;

public class SingStaticInnerClass {
    private SingStaticInnerClass () {}

    private static class Holder {
        private final static SingStaticInnerClassTest INSTANCE = new SingStaticInnerClassTest();
    }

    public static SingStaticInnerClassTest getInstance() {
        return Holder.INSTANCE;
    }

}
