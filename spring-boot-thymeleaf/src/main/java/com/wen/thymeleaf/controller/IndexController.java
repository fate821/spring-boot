package com.wen.thymeleaf.controller;

import com.wen.thymeleaf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class IndexController {


    @RequestMapping("/index")
    public String index(Model model){
        System.out.println(3333);
        return "index";
    }
}
