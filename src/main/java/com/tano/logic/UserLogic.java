package com.tano.logic;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tano.dao.UserDao;
import com.tano.entity.UserEntity;
import com.tano.entity.pojo.User;
import com.tano.exception.NotFoundException;
import com.tano.request.CreateUserRequest;
import com.tano.request.UpdateCustomerRequest;

import java.util.Date;

public class UserLogic {
    //@Autowired
    //@Setter private UserDao userDao;

//    public User createUser(CreateUserRequest ur) {
//        Date now = new Date();
//        UserEntity ue = new UserEntity();
//        ue.setId(ur.getId());
//        ue.setUserName(ur.getUserName());
//        ue.setUserEmail(ur.getUserEmail());
//        ue.setCreationDate(now);
//        ue.setLastUpdatedDate(now);
//        return userDao.create(ue);
//    }
//
//    public User getUserById(String userId) {
//        return userDao.getUserById(userId);
//    }
//
//    public User updateUser(String userId, UpdateCustomerRequest ur) {
//        UserEntity u = userDao.getUserEntityById(userId);
//        if(u == null) {
//            throw new NotFoundException("User was not found.");
//        }
//        u.setUserName(ur.getUserName());
//        u.setUserEmail(ur.getUserEmail());
//        return userDao.updateUser(u);
//    }
}
