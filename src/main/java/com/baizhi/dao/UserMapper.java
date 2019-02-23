package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String vuUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String vuUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}