package ru.javamentor.preproject.task34server.dao;

import ru.javamentor.preproject.task34server.model.User;

import java.util.List;


public interface UserDao {
    boolean addUser(User user);

    boolean updateUser(User user);

    void removeUser(Long id);

    List listUser();

    User findByUsername(String name);

    User findByUserEmail(String email);
}
