package com.exam.service;

import com.exam.entity.User;
import com.exam.entity.UserRole;

import java.util.Set;

public interface UserService {
    //creating user
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    //get  user by username
    public User getUser(String username);

    //delete user by id
    public  void deleteUser(Long userId);
}
