package com.mingwei.repository;

import com.mingwei.entity.Admin;

public interface AdminRepository {
    public Admin login(String username, String password);
}
