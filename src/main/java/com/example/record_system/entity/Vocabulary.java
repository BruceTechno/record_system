package com.example.record_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vocabulary")
public class Vocabulary {
//     單字 今天學了啥英文單字
    // 或  今天學了啥日文單字
@Id
@Column(name = "ID")
private Integer id ;
    // Id vocabulary 、 日期
}
