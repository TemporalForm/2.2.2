package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", "2022"));
        cars.add(new Car("Ford", "Mustang", "2021"));
        cars.add(new Car("BMW", "X5", "2023"));
        cars.add(new Car("Tesla", "Model 3", "2024"));
        cars.add(new Car("Honda", "Civic", "2020"));
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return count > 0 && count <= cars.size() ? cars.subList(0, count) : cars;
    }
}
