package com.newdx.baili.controller;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.User;
import com.newdx.baili.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login.do")
    public JsonBean login(User user, HttpSession session) {
        if (userService.login(user).getCode() == 1) {
            session.setAttribute("user",userService.login(user).getInfo());
        }
        return userService.login(user);
    }

    @RequestMapping("/register.do")
    public JsonBean register(User user){
        return userService.register(user);
    }
}
