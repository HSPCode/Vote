package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer vuUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer vuUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectUserByName(@Param("name") String name);
}