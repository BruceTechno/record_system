package com.example.record_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gymset")
public class GymSet {
    // 健身 今天練啥 練了哪些動作 這些動組的組數
    @Id
    @Column(name = "ID")
    private Integer id ;
    // (練的部位做ID)胸、背、腿、肩 、動作(飛鳥 上胸 滑輪下拉) 、組數(set)

}
