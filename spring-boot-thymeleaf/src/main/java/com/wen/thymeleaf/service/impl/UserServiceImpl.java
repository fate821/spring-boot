package com.wen.thymeleaf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.wen.thymeleaf.entity.User;
import com.wen.thymeleaf.mapper.UserMapper;
import com.wen.thymeleaf.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
