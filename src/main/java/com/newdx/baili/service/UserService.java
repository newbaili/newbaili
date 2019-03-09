package com.newdx.baili.service;

import com.newdx.baili.common.JsonBean;
import com.newdx.baili.entity.User;

public interface UserService {

    public JsonBean login(User user);

    public JsonBean register(User user);
}
