package com.baizhi.dao;

import com.baizhi.entity.Item;

public interface ItemMapper {
    int deleteByPrimaryKey(Integer viId);

    int insert(Item record);

    int insertSelective(Item record);

    Item selectByPrimaryKey(Integer viId);

    int updateByPrimaryKeySelective(Item record);

    int updateByPrimaryKey(Item record);
}