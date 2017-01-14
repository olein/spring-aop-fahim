package com.spring.batch;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public class UserService implements IUserService {
    IUserDAO userDAO;
   
    @Transactional(readOnly = false)
    @Override
    public void addUser(User user) {
        getUserDAO().addUser(user);
    }
   
    @Override
    public List<User> getUsers() {
        return getUserDAO().getUsers();
    }
    public IUserDAO getUserDAO() {
        return userDAO;
    }
    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
