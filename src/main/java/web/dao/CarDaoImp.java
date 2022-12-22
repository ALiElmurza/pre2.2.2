package web.dao;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImp implements CarDao {
    private final List<Car> list = new ArrayList<>();
    CarDaoImp() {
        list.add(new Car("Ferrari", 166, 260));
        list.add(new Car("Ferrari", 275, 280));
        list.add(new Car("Ferrari", 250, 270));
        list.add(new Car("Ferrari", 246, 220));
        list.add(new Car("Ferrari", 308, 320));
    }

    public List<Car> listCars() {
        return list;
    }


}
