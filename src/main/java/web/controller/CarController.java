package web.controller;


import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiseImpl;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String carPR(@RequestParam(value = "count", required = false) String count,  Model model){
        Car car1 = new Car("1", "11", 1);
        Car car2 = new Car("2", "22", 2);
        Car car3 = new Car("3", "33", 3);
        Car car4 = new Car("4", "44", 4);
        Car car5 = new Car("5", "55", 5);
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        CarServiseImpl carServise = new CarServiseImpl();
        model.addAttribute("cars", carServise.getTable(list, count));
        return "cars";
    }
}
