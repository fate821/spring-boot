package com.wen.boot.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wen.boot.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

