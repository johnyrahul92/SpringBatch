package com.onlinetechvision.user.dao;

import java.util.List;

import com.onlinetechvision.model.CityDo;
import org.hibernate.SessionFactory;

import com.onlinetechvision.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * User DAO
 *
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */

@Component("userDao")
public class UserDAO implements IUserDAO {


    @Autowired
    private SessionFactory sessionFactory;
 
    /**
     * Gets Hibernate Session Factory
     *
     * @return SessionFactory - Hibernate Session Factory
     */
   /* public SessionFactory getSessionFactory() {
        return sessionFactory;
    }*/
 
    /**
     * Sets Hibernate Session Factory
     *
     * @param SessionFactory - Hibernate Session Factory
     */
  /*  public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }*/
 
    /**
     * Adds User
     *
     * @param  User user
     *
     */
    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
 
    /**
     * Gets User List
     *
     * @return List - User list
     *
     */
    @SuppressWarnings({ "unchecked" })
	@Override
    public List<User> getUsers() {
        List<User> list = sessionFactory.getCurrentSession().createQuery("from User").list();
        return list;
    }

    @Override
    public void addCity(CityDo cityDo) {
        sessionFactory.getCurrentSession().saveOrUpdate(cityDo);
    }
 
}
