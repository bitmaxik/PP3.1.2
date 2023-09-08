package com.kata.PP312.dao;



import com.kata.PP312.model.User;

import java.util.List;

public interface UserDao {

    List<User> getUsers();

    User show(long id);

    void save(User user);

    void update(long id, User updatedUser);

    void delete(long id);

}
