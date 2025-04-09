package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "-1") int count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.getCarsByCount(count));
        return "cars";
    }
}
