package com.example.record_system.repository;

import com.example.record_system.entity.Category;
import com.example.record_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
    @Transactional
    @Modifying
    @Query(value = "insert into user(account,pwd,name,mail)" +
            " select :inputAccount, :inputPwd, :inputName, :inputMail " +
            " where not exists (select 1 from user where account = :inputAccount)" ,nativeQuery = true)
    public int insertUserInfoWhereNotExists(
            @Param("inputAccount")String account,
            @Param("inputPwd")String inputPwd,
            @Param("inputName")String inputName,
            @Param("inputMail")String inputMail);

    public User findByAccountAndPwd(String account ,String pwd);
}
