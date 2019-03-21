package com.datasources.demo.entity.two;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name="house")
@DynamicUpdate(true)
@DynamicInsert(true)
public class House {

    private int houseId;
    private String houseName;
    private String houseIntroduce;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="house_id",nullable=true)
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    @Column(name ="house_name",nullable=true)
    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    @Column(name ="house_introduce",nullable=true)
    public String getHouseIntroduce() {
        return houseIntroduce;
    }

    public void setHouseIntroduce(String houseIntroduce) {
        this.houseIntroduce = houseIntroduce;
    }

    public House(String houseName, String houseIntroduce) {
        this.houseName = houseName;
        this.houseIntroduce = houseIntroduce;
    }
}
