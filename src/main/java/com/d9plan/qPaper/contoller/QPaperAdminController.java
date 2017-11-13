package com.d9plan.qPaper.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class QPaperAdminController {
 
    @RequestMapping("/admin")
    public String requestResponseExample(HttpServletRequest request,
            HttpServletResponse reponses, Model model) { 
        
        model.addAttribute("greeting", "Hello Spring MVC");
        
        return "adminModule";
        
    }
}

