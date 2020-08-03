package com.mingwei.repository;

import com.mingwei.entity.User;

import java.util.List;

public interface UserRepository {
    public User findById(long id);
}
