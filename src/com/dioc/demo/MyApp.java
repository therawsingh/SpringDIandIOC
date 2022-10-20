package com.dioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        //Initialize bean factory

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get beans from the configuration file

        Engine car = context.getBean("carEngine", Engine.class);
        Engine bike = context.getBean("bikeEngine", Engine.class);
        TrainEngine train = context.getBean("trainEngine", TrainEngine.class);

        System.out.print("\n");

        System.out.println("Car " + car.doAction());
        System.out.println("Bike " + bike.doAction());

        System.out.print("\n");

        System.out.println("Train " + train.doAction());
        System.out.println("Train destination : " + train.getDestination());
    }

}
