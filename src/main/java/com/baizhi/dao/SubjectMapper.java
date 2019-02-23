package com.baizhi.dao;

import com.baizhi.entity.Subject;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer vsId);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer vsId);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}