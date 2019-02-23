package com.baizhi.dao;

import com.baizhi.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer vuUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer vuUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}