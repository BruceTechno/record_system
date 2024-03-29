package com.example.record_system.entity;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    //其他主表的分類
    // 錢的分類 如 飲食、交通、電話費
    // 健身的分類 上胸、下胸、蝴蝶機飛鳥、
    // 單字的分類 英文 、 日文
    // id 、 其他主表ID 、 category Name (分類名稱)
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "CTG_FOR")
    private String ctgFor;
    @Column(name = "CTG_NAM")
    private String name;
//==
    public Category() {
    }

    public Category(String userId, String ctgFor, String name) {
        this.userId = userId;
        this.ctgFor = ctgFor;
        this.name = name;
    }
    //  ==

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCtgFor() {
        return ctgFor;
    }

    public void setCtgFor(String ctgFor) {
        this.ctgFor = ctgFor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
