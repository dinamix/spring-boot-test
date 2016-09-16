package entity;

import entity.pojo.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {
    @Id private String id;
    private String userName;
    private String userEmail;
    private Date creationDate;
    private Date lastUpdatedDate;

    public User toUser() {
        User u = new User();
        u.setId(id);
        u.setUserEmail(userEmail);
        u.setUserName(userName);
        return u;
    }
}
