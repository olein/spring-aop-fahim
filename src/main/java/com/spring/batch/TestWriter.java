package com.spring.batch;

import java.util.List;
import org.springframework.batch.item.ItemWriter;
/**
 *
 * @author lenovo
 */
public class TestWriter implements ItemWriter<User> {
    private IUserService userService;
    
    @Override
    public void write(List<? extends User> userList) throws Exception {
        for(User user : userList) {
            getUserService().addUser(user);
        }
        System.out.println("User List : " + getUserService().getUsers());
    }
    public IUserService getUserService() {
        return userService;
    }
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}