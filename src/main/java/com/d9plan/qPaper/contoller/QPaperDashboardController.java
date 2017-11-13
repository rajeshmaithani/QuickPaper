package com.d9plan.qPaper.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class QPaperDashboardController {
 
    @RequestMapping("/dashboard")
    public String dashboardModule(Model model) {
        
        model.addAttribute("greeting", "Hello Spring MVC");
        
        return "dashboardModule";
        
    }
}