package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private List<Car> getListCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ferrari", 166, 260));
        cars.add(new Car("Ferrari", 275, 280));
        cars.add(new Car("Ferrari", 250, 270));
        cars.add(new Car("Ferrari", 246, 220));
        cars.add(new Car("Ferrari", 308, 320));
        return cars;
    }
    @GetMapping(value = "")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", getListCar().stream().map(x -> x.toString()).toList());
        return "cars";
    }
    @GetMapping(value = "/count=2")
    public String printTwoCar(ModelMap model) {
        model.addAttribute("cars", getListCar().stream().limit(2).map(x -> x.toString()).toList());
        return "cars";
    }
    @GetMapping(value = "/count=3")
    public String printThreeCar(ModelMap model) {
        model.addAttribute("cars", getListCar().stream().limit(3).map(x -> x.toString()).toList());
        return "cars";
    }
    @GetMapping(value = "/count=4")
    public String printFourCar(ModelMap model) {
        model.addAttribute("cars", getListCar().stream().limit(4).map(x -> x.toString()).toList());
        return "cars";
    }

    @GetMapping(value = "/count=5")
    public String printFiveCar(ModelMap model) {
        model.addAttribute("cars", getListCar().stream().limit(5).map(x -> x.toString()).toList());
        return "cars";
    }

}
