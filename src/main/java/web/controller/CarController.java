package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = {"/cars", "/cars?count={}" })
    public String printWelcome(ModelMap model, @RequestParam(required = false) Integer count) {
        if (count != null) {
            model.addAttribute("cars", carService.count(carService.allCars(), count));
        } else {
            model.addAttribute("cars", carService.count(carService.allCars(), carService.allCars().size()));
        }
        return "cars";
    }
}
