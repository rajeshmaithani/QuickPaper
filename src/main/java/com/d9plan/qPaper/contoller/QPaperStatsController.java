package com.d9plan.qPaper.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class QPaperStatsController {
    @RequestMapping("/stats")
    public String statsModule(Model model) {
        model.addAttribute("greeting", "Hello Spring MVC");
        return "statsModule";
    }
}