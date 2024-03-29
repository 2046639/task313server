package ru.javamentor.preproject.task34server.service;

import ru.javamentor.preproject.task34server.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> addUser(User user);

    Optional<User> updateUser(User user);

    void removeUser(Long id);

    List<User> listUser();

    User findByUsername(String name);

    User findByUserEmail(String email);
}
