package lexicon.se.workshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String goToIndexPage() {
        System.out.println("IndexPage");
        return "index";
    }

    @GetMapping("/home")
    public String demo(Model model) {
        model.addAttribute("msg", "Welcome to my first web app");

        model.addAttribute("serverTime", LocalDateTime.now());

        String firstName = "Adam";
        String lastName = "Larsson";
        LocalDate date = LocalDate.now();


        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("d", date);

        return "home";
    }
}

