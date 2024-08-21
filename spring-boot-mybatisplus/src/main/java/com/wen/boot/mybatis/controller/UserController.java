package com.wen.boot.mybatis.controller;

import com.wen.boot.mybatis.config.Result;
import com.wen.boot.mybatis.entity.User;
import com.wen.boot.mybatis.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "用户管理", description = "用户管理API", position = 100, protocols = "http")
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/index")
    public String userInfo() {
        return "user";
    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }

    @GetMapping("/add")
    public String add() {
        return "add";
    }

    @ApiOperation(value = "获取用户列表", notes = "查询用户列表")
    @ResponseBody
    @GetMapping("/search")
    public Result search() {
        List<User> userList = userService.list();
        return Result.success(userList);
    }

    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    @ResponseBody
    @PostMapping("/save")
    public Result save(User user) {
        System.out.println(user);
        userService.save(user);
        return Result.success();
    }

    @ApiOperation(value = "获取用户信息", notes = "根据用户ID对象获取用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    @ResponseBody
    @GetMapping("/info")
    public Result info(int id) {
        User user = userService.getById(id);
//        System.out.println(userName);
//        userService.save(user);
        return Result.success(user);
    }

    @ApiOperation(value = "删除用户信息", notes = "根据用户ID删除用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    @ResponseBody
    @PostMapping("/delete")
    public Result delete(Integer id) {
        userService.removeById(id);
        return Result.success("删除成功");
    }

    @ApiOperation(value = "更新用户信息")
    @ResponseBody
    @PostMapping("/update")
    public Result update(User user) {
        userService.updateById(user);
        return Result.success("更新成功");
    }

    @ResponseBody
    @GetMapping("/param2")
    public String param2(User user) {
        System.out.println(user);
//        userService.save(user);
        return "1";
    }

    @ResponseBody
    @GetMapping("/paramPath/{userName}")
    public String paramPath(@PathVariable("userName") String userName) {
        System.out.println(userName);
//        userService.save(user);
        return "1";
    }

    @ResponseBody
    @PostMapping("/list")
    public String list(@RequestBody List<User> user) {
        System.out.println(user);
//        userService.save(user);
        return "1";
    }


}
