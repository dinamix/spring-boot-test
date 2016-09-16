package logic;

import dao.UserDao;
import entity.UserEntity;
import entity.pojo.User;
import exception.NotFoundException;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import request.CreateUserRequest;
import request.UpdateCustomerRequest;

import java.util.Date;

@Component
public class UserLogic {
    @Autowired
    @Setter private UserDao userDao;

    public User createUser(CreateUserRequest ur) {
        Date now = new Date();
        UserEntity ue = new UserEntity();
        ue.setId(ur.getId());
        ue.setUserName(ur.getUserName());
        ue.setUserEmail(ur.getUserEmail());
        ue.setCreationDate(now);
        ue.setLastUpdatedDate(now);
        return userDao.create(ue);
    }

    public User getUserById(String userId) {
        return userDao.getUserById(userId);
    }

    public User updateUser(String userId, UpdateCustomerRequest ur) {
        UserEntity u = userDao.getUserEntityById(userId);
        if(u == null) {
            throw new NotFoundException("User was not found.");
        }
        u.setUserName(ur.getUserName());
        u.setUserEmail(ur.getUserEmail());
        return userDao.updateUser(u);
    }
}
