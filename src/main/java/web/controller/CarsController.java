package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDaoImp;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDaoImp carDao;

    public CarsController(CarDaoImp carDao) {
        this.carDao = carDao;
    }


    @GetMapping(value = "")
    public String printCars(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
        if (count != null) {
            model.addAttribute("cars", carDao.listCars().stream()
                    .limit(Integer.parseInt(count)).map(x ->x.toString()).toList());
        } else {
            model.addAttribute("cars", carDao.listCars().stream().map(x -> x.toString()).toList());
        }
        return "cars";
    }

}
