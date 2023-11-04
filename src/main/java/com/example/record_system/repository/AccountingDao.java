package com.example.record_system.repository;

import com.example.record_system.entity.Accounting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountingDao extends JpaRepository<Accounting,Integer> {

}
