package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImp;
import javax.servlet.http.HttpServletRequest;
import java.util.regex.Pattern;


@Controller
public class CarsController {

    private final CarDaoImp carDao;

    public CarsController(CarDaoImp carDao) {
        this.carDao = carDao;
    }


    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(required=false) Integer count, ModelMap model) {
        if (count != null) {
            model.addAttribute("cars", carDao.listCars().stream()
                    .limit(count).map(x ->x.toString()).toList());
        } else {
            model.addAttribute("cars", carDao.listCars().stream().map(x -> x.toString()).toList());
        }
        return "cars";
    }

}
