package com.spring.batch;
import java.util.List;

public interface IUserService {    
    void addUser(User user);    
    List<User> getUsers();
}
