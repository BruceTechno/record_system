package com.example.record_system.repository;

import com.example.record_system.entity.Category;
import com.example.record_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
