package com.example.record_system.controller;

import com.example.record_system.constants.RtnCode;
import com.example.record_system.service.ifs.UserService;
import com.example.record_system.vo.request.LoginRequest;
import com.example.record_system.vo.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "register")
    public LoginResponse register(@RequestBody LoginRequest request) {
        return userService.register(request);
    }
    @PostMapping(value = "login")
    public LoginResponse login(@RequestBody LoginRequest request , HttpSession session) {
        LoginResponse result = userService.login(request);
        if (result.getMessage().equalsIgnoreCase(RtnCode.SUCCESSFUL.getMessage())) {
            double random = Math.random() * 10000;
            int verifyCode = (int) Math.round(random);// round四捨五入
            session.setAttribute("verifyCode", verifyCode);
            session.setAttribute("account", request.getAccount());
            session.setAttribute("pwd", request.getPwd());
            session.setMaxInactiveInterval(60000);// 設定session存活時間 單位:秒
        }
        return result;
    }
}
