package com.tano.dao.impl;

import lombok.Setter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import com.tano.dao.UserDao;
import com.tano.entity.UserEntity;
import com.tano.entity.pojo.User;

import java.util.Date;

public class UserDaoImpl /*implements UserDao*/ {
//    @Autowired
//    @Setter private SessionFactory sessionFactory;
//
//    @Override
//    public User create(UserEntity user) {
//        Date now = new Date();
//        user.setCreationDate(now);
//        user.setLastUpdatedDate(now);
//        sessionFactory.getCurrentSession().save(user);
//        return user.toUser();
//    }
//
//    @Override
//    public User getUserById(String userId) {
//        UserEntity user = (UserEntity)sessionFactory.getCurrentSession().get(UserEntity.class, userId);
//        if(user == null) return null;
//        return user.toUser();
//    }
//
//    @Override
//    public UserEntity getUserEntityById(String userId) {
//        return (UserEntity)sessionFactory.getCurrentSession().get(UserEntity.class, userId);
//    }
//
//    @Override
//    public User updateUser(UserEntity user) {
//        Date now = new Date();
//        user.setLastUpdatedDate(now);
//        sessionFactory.getCurrentSession().save(user);
//        return user.toUser();
//    }
}
