package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.User;

import java.util.List;

public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoImpl();


    @Override
    public int saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public User getUserByID(int ID) {
        return null;
    }

    @Override
    public List<User> getAllUserUser() {
        return null;
    }
}

