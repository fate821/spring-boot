package com.wen.thymeleaf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wen.thymeleaf.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

