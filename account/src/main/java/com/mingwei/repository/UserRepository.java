package com.mingwei.repository;

import com.mingwei.entity.User;

public interface UserRepository {
    public User login(String username, String password);
}
