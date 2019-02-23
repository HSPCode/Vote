package com.baizhi.service;

import com.baizhi.entity.User;

import javax.servlet.http.HttpSession;
import java.util.Map;



public interface UserService {
    Map<String, String> login(User user, HttpSession session);
    void regist(User user);
}
