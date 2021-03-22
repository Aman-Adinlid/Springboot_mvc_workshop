package lexicon.se.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/demo")
    public String demo(){
return "demo";
    }
}
