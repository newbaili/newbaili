package com.newdx.baili.dao;

import com.newdx.baili.entity.Size;

public interface SizeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Size record);

    int insertSelective(Size record);

    Size selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
}