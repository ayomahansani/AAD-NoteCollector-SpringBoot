package lk.ijse.notecollectorspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // want to return an UI (server side rendering - client ta peena frontend ekath generate karanne server eka patthen)
@RequestMapping("api/v1/welcome")
public class WelcomeController {

    @GetMapping
    public String viewWelcomeScreen(Model model){ // thymeleaf
        model.addAttribute("message", "Hi......");
        model.addAttribute("anotherMessage", "NoteCollector - SpringBoot");
        return "welcome";
    }
}
