package com.learn.ioc;

public class Vodafone implements Sim{

    public void calling() {
        System.out.println("Calling using Vodafone Sim");
    }

    public void data() {
        System.out.println("Browsing using Vodafone Sim");
    }
}
