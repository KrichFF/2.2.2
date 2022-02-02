package web.controller;


import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiseImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String carPR(@RequestParam(value = "count", required = false) String count, Model model) {
        CarService carServise = new CarServiseImpl();
        model.addAttribute("cars", carServise.getTable(count));
        return "cars";
    }
}
