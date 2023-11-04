package com.example.record_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    // id account pwd name mail
    @Id
    @Column(name = "ID")
    private Integer id ;
    @Column(name = "ACCOUNT")
    private String account;
    @Column(name = "PWD")
    private String pwd;
    @Column(name = "NAME")
    private String name;
    @Column(name = "MAIL")
    private String mail;
//==


    public User() {
    }
//==

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
