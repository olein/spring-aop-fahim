/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.batch;

import java.util.*;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 *
 * @author Fahim Fahad
 */
public class ListReader implements ItemReader<User> {

    private int nextUserIndex;
    List<User> users = new ArrayList<User>();

    public ListReader() {
        users.add(new User("fahim", "fahimpass"));
        users.add(new User("fahim2", "fahim2pass"));
        users.add(new User("fahim3", "fahim3pass"));
        users.add(new User("fahim4", "fahim4pass"));
        nextUserIndex = 0;        
    }  

    public User read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        User nextUser = null;

        if (nextUserIndex < users.size()) {
            nextUser = users.get(nextUserIndex);
            nextUserIndex++;
        }
        return nextUser;
    }
}
