package dao;

import entity.UserEntity;
import entity.pojo.User;
import org.springframework.stereotype.Component;

@Component
public interface UserDao {
    User create(UserEntity user);
    User getUserById(String userId);
    UserEntity getUserEntityById(String userId);
    User updateUser(UserEntity user);
}
