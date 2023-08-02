package com.PP_3_1_2.pp3_1_2.dao;


import com.PP_3_1_2.pp3_1_2.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void saveUser(User user);
    void update(long id, User user);
    void deleteUserById(Long id);
}
