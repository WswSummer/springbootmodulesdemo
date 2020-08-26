package com.wsw.demoservice.service.impl;

import com.wsw.demobase.entity.User;
import com.wsw.demodao.mapper.UserMapper;
import com.wsw.demoservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 14:06 2020/8/26
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser(){
        return userMapper.getAllUser();
    }
}
