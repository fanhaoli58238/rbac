package com.bjsxt.service;

import com.bjsxt.pojo.Users;

import java.util.Map;

public interface UsersService {
    Map<String,Object> login(Users users);
}
