package com.wen.boot.mybatis.controller;

import com.wen.boot.mybatis.entity.User;
import com.wen.boot.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/index")
    public String userInfo(){
        return "user";
    }

    @ResponseBody
    @PostMapping("/save")
    public String save(User user){
        System.out.println(user);
        userService.save(user);
        return "1";
    }
}
