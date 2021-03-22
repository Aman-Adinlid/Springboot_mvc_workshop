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

    @GetMapping("/demo")
    public String demo(Model model) {
        String welcomeMessage = "Welcome to my first web app";
        model.addAttribute("welcomeMessage", welcomeMessage);

        model.addAttribute("serverTime", LocalDateTime.now());

        String tableName = "test";
        int price = 300;
        LocalDate date = LocalDate.now();


        model.addAttribute("tableName", tableName);
        model.addAttribute("price", price);
        model.addAttribute("d", date);

        return "demo";
    }
}

