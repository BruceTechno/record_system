package com.example.record_system.repository;

import com.example.record_system.entity.Vocabulary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabularyDao extends JpaRepository<Vocabulary,Integer> {
}
