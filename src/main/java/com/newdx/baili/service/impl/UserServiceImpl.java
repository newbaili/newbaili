package com.newdx.baili.service.impl;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.dao.UserMapper;
import com.newdx.baili.entity.User;
import com.newdx.baili.service.UserService;
import com.newdx.baili.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public JsonBean login(User user) {
        User getuser = userMapper.selectByName(user.getUsername());

        if (getuser == null) {
            return JsonUtils.createJsonBean(0,"用户名错误");
        }

        if (!getuser.getPassword().equals(user.getPassword())){
            return JsonUtils.createJsonBean(0,"密码错误");
        }

        return JsonUtils.createJsonBean(1,getuser);
    }

    @Override
    public JsonBean register(User user) {
        User getuser = userMapper.selectByName(user.getUsername());
        if (getuser != null) {
            return JsonUtils.createJsonBean(0,"用户名已存在，请更换");
        }

        userMapper.insert(user);

        return JsonUtils.createJsonBean(1,getuser);
    }
}
