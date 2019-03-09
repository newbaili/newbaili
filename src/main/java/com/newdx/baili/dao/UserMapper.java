package com.newdx.baili.dao;

import com.newdx.baili.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User selectById(Integer id);

    User selectByName(String username);

    int insert(User record);

    int updateByIdSelective(User record);
}