package edu.javacourse.Car;

import edu.javacourse.Car.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Audi implements Car {
    List<String> audis = new ArrayList<>();

    {
        audis.add("Q5");
        audis.add("Q3");
        audis.add("Q8");
        audis.add("A7");
        audis.add("A6");
    }

    @Override
    public List<String> getCars() {
        return audis;
    }
}
