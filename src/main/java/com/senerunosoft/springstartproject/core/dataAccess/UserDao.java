package com.senerunosoft.springstartproject.core.dataAccess;

import com.senerunosoft.springstartproject.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByEmail(String email);
}
