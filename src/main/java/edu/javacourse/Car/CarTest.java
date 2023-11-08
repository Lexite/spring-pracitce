package edu.javacourse.Car;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


    CarHandler carHandler = context.getBean("carHandler", CarHandler.class);


    carHandler.pickCar(CarType.TOYOTA);
    carHandler.pickCar(CarType.AUDI);






    context.close();

    }





}
