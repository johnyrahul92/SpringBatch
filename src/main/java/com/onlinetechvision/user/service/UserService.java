package com.onlinetechvision.user.service;
 
import java.util.List;

import com.onlinetechvision.model.CityDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
import com.onlinetechvision.user.User;
import com.onlinetechvision.user.dao.IUserDAO;
 
/**
 *
 * User Service
 *
 * @author onlinetechvision.com
 * @since 10 Dec 2012
 * @version 1.0.0
 *
 */

@Component("userService")
@Transactional(readOnly = true)
public class UserService implements IUserService {


    @Autowired
    IUserDAO userDAO;

    /**
     * Adds User
     *
     * @param  User user
     */
    @Transactional(readOnly = false)
    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    /**
     * Gets User List
     *
     */
    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    public void addCity(CityDo cityDo) {
         userDAO.addCity(cityDo);

    }



}