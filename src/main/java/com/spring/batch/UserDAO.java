package com.spring.batch;
import java.util.List;
import org.hibernate.SessionFactory;

public class UserDAO implements IUserDAO {
    private SessionFactory sessionFactory;
   
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
   
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
   
    @Override
    public void addUser(User user) {
        getSessionFactory().getCurrentSession().save(user);
    }
   
    @SuppressWarnings({ "unchecked" })
    @Override
    public List<User> getUsers() {
        List<User> list = getSessionFactory().getCurrentSession().createQuery("from User").list();
        return list;
    }
}