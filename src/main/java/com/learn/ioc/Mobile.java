package com.learn.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Config Loaded");

        /*Airtel air = (Airtel)context.getBean("airtel");
        air.data();
        air.calling();*/


        /*Vodafone vodaphone = context.getBean("vodaphone", Vodafone.class);

        vodaphone.calling();
        vodaphone.data();*/

        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();

    }
}
