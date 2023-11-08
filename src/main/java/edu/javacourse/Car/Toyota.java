package edu.javacourse.Car;

import edu.javacourse.Car.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class Toyota implements Car {

    List<String> toyotas = new ArrayList<>();
    {

        toyotas.add("Corola");
        toyotas.add("Land Cruiser");
        toyotas.add("Rav4");
        toyotas.add("Highlander");
        toyotas.add("Yaris");
    }

    @Override
    public List<String> getCars() {
        return toyotas;
    }
}
