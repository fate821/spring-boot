package com.wen.boot.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wen.boot.mybatis.entity.User;
import com.wen.boot.mybatis.mapper.UserMapper;
import com.wen.boot.mybatis.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
}
