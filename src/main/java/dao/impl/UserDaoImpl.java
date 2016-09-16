package dao.impl;

import dao.UserDao;
import entity.UserEntity;
import entity.pojo.User;
import lombok.Setter;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@ComponentScan
public class UserDaoImpl implements UserDao {
    @Autowired
    @Setter private SessionFactory sessionFactory;

    @Override
    public User create(UserEntity user) {
        Date now = new Date();
        user.setCreationDate(now);
        user.setLastUpdatedDate(now);
        sessionFactory.getCurrentSession().save(user);
        return user.toUser();
    }

    @Override
    public User getUserById(String userId) {
        UserEntity user = (UserEntity)sessionFactory.getCurrentSession().get(UserEntity.class, userId);
        if(user == null) return null;
        return user.toUser();
    }

    @Override
    public UserEntity getUserEntityById(String userId) {
        return (UserEntity)sessionFactory.getCurrentSession().get(UserEntity.class, userId);
    }

    @Override
    public User updateUser(UserEntity user) {
        Date now = new Date();
        user.setLastUpdatedDate(now);
        sessionFactory.getCurrentSession().save(user);
        return user.toUser();
    }
}
