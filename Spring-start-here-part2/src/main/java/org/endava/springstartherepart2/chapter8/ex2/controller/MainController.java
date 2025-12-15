package org.endava.springstartherepart2.chapter8.ex2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(
            @RequestParam(required = false) String color,
            Model page
    ){
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "homeCh8ex2.html";
    }
}
