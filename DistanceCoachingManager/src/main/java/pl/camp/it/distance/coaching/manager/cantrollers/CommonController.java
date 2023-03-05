package pl.camp.it.distance.coaching.manager.cantrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String manin() {
        return "redirect:/";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main2() {
        return "main";
    }
}
