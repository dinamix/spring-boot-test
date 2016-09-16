package com.tano.dao;

import org.springframework.stereotype.Component;

import com.tano.entity.UserEntity;
import com.tano.entity.pojo.User;

public interface UserDao {
    User create(UserEntity user);
    User getUserById(String userId);
    UserEntity getUserEntityById(String userId);
    User updateUser(UserEntity user);
}
