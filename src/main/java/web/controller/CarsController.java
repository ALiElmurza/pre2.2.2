package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private CarDao getDao() {
        return new CarDaoImp();
    }
    @GetMapping(value = "")
    public String printCars(HttpServletRequest request, ModelMap model) {
        String count = request.getParameter("count");
        if (count != null) {
            model.addAttribute("cars", getDao().listCars().stream()
                    .limit(Integer.parseInt(count)).map(x ->x.toString()).toList());
        } else {
            model.addAttribute("cars", getDao().listCars().stream().map(x -> x.toString()).toList());
        }
        return "cars";
    }

}
