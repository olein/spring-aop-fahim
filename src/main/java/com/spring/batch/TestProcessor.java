package com.spring.batch;
import org.springframework.batch.item.ItemProcessor;
public class TestProcessor implements ItemProcessor<User, User>  {
  
    @Override
    public User process(User user) throws Exception {
        user.setName(user.getName().toUpperCase());
        user.setPassword(user.getPassword().toUpperCase());
        return user;
    }
}