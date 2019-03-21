package com.datasources.demo.repository.one;

import com.datasources.demo.entity.one.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
