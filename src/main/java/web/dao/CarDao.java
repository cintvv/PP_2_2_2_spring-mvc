package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Tesla M3", 1983, "Blue"));
        cars.add(new Car("Mercedes G63", 2014, "White"));
        cars.add(new Car("Audi A6", 1983, "Blue"));
        cars.add(new Car("BMW e34", 1999, "Black"));
        cars.add(new Car("Infinity", 2023, "Red"));
    }

    public List<Car> getCars() {
        return cars;
    }
}
