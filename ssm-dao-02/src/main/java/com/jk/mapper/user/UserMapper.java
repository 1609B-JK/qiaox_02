package com.jk.mapper.user;

import com.jk.entity.user.UserRequest;
import com.jk.entity.user.UserResponse;

/**
 * Created by DELL on 2017/5/23.
 */
public interface UserMapper {
    UserResponse login(UserRequest userRequest);

    void insertUser(UserRequest userRequest);
}
