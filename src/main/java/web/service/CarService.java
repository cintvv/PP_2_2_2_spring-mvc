package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public interface CarService {
    List<Car> count(List<Car> cars, int count);
    List<Car> allCars();
}
