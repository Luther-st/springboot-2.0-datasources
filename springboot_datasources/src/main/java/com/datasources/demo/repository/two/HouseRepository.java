package com.datasources.demo.repository.two;

import com.datasources.demo.entity.two.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Integer> {
}
