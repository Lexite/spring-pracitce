package edu.javacourse.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class CarHandler {
    private Audi audi;
    private Toyota toyota;


    @Autowired
    public CarHandler( Audi audi, Toyota toyota) {
        this.audi = audi;
        this.toyota = toyota;
    }

    public void pickCar(CarType type){
        Random random = new Random();

        if (type == CarType.TOYOTA){
            System.out.println(toyota.getCars().get(random.nextInt(toyota.toyotas.size())));
        }
        else {
            System.out.println(audi.getCars().get(random.nextInt(audi.audis.size())));
        }
    }
}
