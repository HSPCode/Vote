package com.baizhi.service.impl;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Map<String, String> login(User user, HttpSession session) {
        Map<String, String> map = new HashMap<>();
        map.put("code", "200");
        map.put("result", "登陆成功!");
        User u = userMapper.selectUserByName(user.getVuUserName());
        if (u == null) {
            map.put("code", "500");
            map.put("result", "账号不存在!");
            return map;
        } else if (!u.getVuPassword().equals(user.getVuPassword())) {
            map.put("code", "500");
            map.put("result", "密码错误!");
            return map;
        }
        session.setAttribute("user", u);
        return map;
    }
}
