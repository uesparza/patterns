package com.java.pattern.Design.singleton;

public class MainSIngletonDemo {

    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        System.out.println(mySingleton);

        //grab another instance of the singleton
        MySingleton mySingleton2 = MySingleton.getInstance();
        System.out.println(mySingleton2);
    }
}
