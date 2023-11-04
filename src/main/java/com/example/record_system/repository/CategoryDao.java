package com.example.record_system.repository;

import com.example.record_system.entity.Accounting;
import com.example.record_system.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {

    @Transactional
    @Modifying
    @Query(value = "insert into category(USER_ID,CATEGORY_FOR,NAME)" +
            " select :userId,:ctgFor,:name" +
            " where not exists (select 1 from category where USER_ID = :userId and CATEGORY_FOR = :ctgFor and NAME = :name)" ,nativeQuery = true)
    public int insertCategoryWhereNotExists(
            @Param("userId")String userId,
            @Param("ctgFor")String ctgFor,
            @Param("name")String name);

    public List<Category> findAllByUserId(String userId);
}
