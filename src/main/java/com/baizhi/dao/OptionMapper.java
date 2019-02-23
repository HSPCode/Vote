package com.baizhi.dao;

import com.baizhi.entity.Option;

public interface OptionMapper {
    int deleteByPrimaryKey(Integer voId);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(Integer voId);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);
}