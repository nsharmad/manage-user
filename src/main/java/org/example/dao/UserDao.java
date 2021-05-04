package org.example.dao;

import org.example.model.User;

import java.util.List;

public interface UserDao {

    int saveUser(User user);
    int updateUser (User user);
    int deleteUser (int id);

    User getUserByID (int ID);
    List<User> getAllUserUser();



}
