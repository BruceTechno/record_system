package com.example.record_system.repository;

import com.example.record_system.entity.Category;
import com.example.record_system.entity.GymSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymSetDao extends JpaRepository<GymSet,Integer> {
}
