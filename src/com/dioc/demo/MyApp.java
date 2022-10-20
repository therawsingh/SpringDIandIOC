package com.dioc.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        //Initialize bean factory

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get beans from the configuration file

        CarEngine car = context.getBean("carEngine", CarEngine.class);
        Engine bike = context.getBean("bikeEngine", Engine.class);
        Engine bike2 = context.getBean("bikeEngine", Engine.class);
        TrainEngine train = context.getBean("trainEngine", TrainEngine.class);
        TrainEngine train2 = context.getBean("trainEngine", TrainEngine.class);

        //perform actions using the bean

        System.out.print("\n");

        System.out.println("Car " + car.doAction());
        System.out.println(car.getCarModel());
        System.out.println("Bike " + bike.doAction());

        System.out.print("\n");

        System.out.println("Train " + train.doAction());
        System.out.println("Train destination : " + train.getDestination());

        System.out.println(train == train2);
        System.out.println(bike == bike2);

        //close context
        context.close();
    }

}
