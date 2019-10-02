package com.web.service;

import com.web.entity.User;

import java.util.List;

public interface UserService {
    void save (User user);

    User getById(int id);

    List<User> findAll();

    void update (User user);

    void delete (int id);
}
