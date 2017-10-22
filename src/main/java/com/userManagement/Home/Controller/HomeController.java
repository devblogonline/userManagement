package com.userManagement.Home.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    private String message = "Home";

    @RequestMapping("/")
    public String welcome(Model model) {

        return "home";
    }
}

