package com.example.record_system.service.ifs;

import com.example.record_system.vo.request.LoginRequest;
import com.example.record_system.vo.response.LoginResponse;

public interface UserService {
    public LoginResponse register (LoginRequest request);
    public LoginResponse active(LoginRequest request);
    public LoginResponse login (LoginRequest request);

}
