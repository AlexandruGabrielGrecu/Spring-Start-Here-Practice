package org.endava.springstartherepart2.chapter8.ex4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/home/{color}")
    public String home(
            @PathVariable String color,
            Model page
    ){
        page.addAttribute("username", "Katy");
        page.addAttribute("color", color);
        return "homeCh8.html";
    }
}
