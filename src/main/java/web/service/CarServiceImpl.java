package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> count(List<Car> cars, int count) {
        if (count < 0 || count > cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    @Override
    public List<Car> allCars() {
        return carDao.getCars();
    }
}
