package com.wsw.demoweb.controller;


import com.wsw.demobase.entity.User;
import com.wsw.demoservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 12:34 2020/8/26
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
