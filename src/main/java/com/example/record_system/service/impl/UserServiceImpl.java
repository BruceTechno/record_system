package com.example.record_system.service.impl;

import com.example.record_system.constants.RtnCode;
import com.example.record_system.entity.User;
import com.example.record_system.repository.UserDao;
import com.example.record_system.service.ifs.UserService;
import com.example.record_system.vo.request.LoginRequest;
import com.example.record_system.vo.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public LoginResponse register(LoginRequest request) {
        String account = request.getAccount();
        String pwd = request.getPwd();
        String name = request.getName();
        String mail = request.getMail();
        if (!StringUtils.hasText(account) ||
                !StringUtils.hasText(pwd) || !StringUtils.hasText(name) || !StringUtils.hasText(mail)) {
            return new LoginResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        int result = userDao.insertUserInfoWhereNotExists(account, pwd, name, mail);
        if (result == 0) {
            return new LoginResponse(RtnCode.DATA_DUPLICATE.getMessage());
        }
        return new LoginResponse(RtnCode.SUCCESSFUL.getMessage(), new User(account, pwd, name, mail));
    }

    @Override
    public LoginResponse active(LoginRequest request) {
        //todo sending e-mail to active

        return null;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        String account = request.getAccount();
        String pwd = request.getPwd();

        if (!StringUtils.hasText(account) || !StringUtils.hasText(pwd)) {
            return new LoginResponse(RtnCode.CANNOT_EMPTY.getMessage());
        }
        User user = userDao.findByAccountAndPwd(account,pwd);
        if (user == null){
            return new LoginResponse(RtnCode.DATA_ERROR.getMessage());
        }

        return new LoginResponse(RtnCode.SUCCESSFUL.getMessage(),user);
    }
}
