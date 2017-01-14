package com.spring.batch;

import java.util.List;

public interface IUserDAO {
    
    void addUser(User user);
    
    List<User> getUsers();
}
