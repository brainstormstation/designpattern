package com.designpattern.singleton;

public class SingStaticInnerClass {
    private SingStaticInnerClass () {}

    private static class Holder {
        private final static SingStaticInnerClass INSTANCE = new SingStaticInnerClass();
    }

    public static SingStaticInnerClass getInstance() {
        return Holder.INSTANCE;
    }

}
