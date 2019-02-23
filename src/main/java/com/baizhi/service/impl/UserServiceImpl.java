package com.baizhi.service.impl;

import com.baizhi.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service
@Transactional
public class UserServiceImpl implements Serializable {
    @Autowired
    private UserMapper userMapper;
}
