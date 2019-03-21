package com.datasources.demo.service.impl;

import com.datasources.demo.entity.one.City;
import com.datasources.demo.entity.two.House;
import com.datasources.demo.repository.one.CityRepository;
import com.datasources.demo.repository.two.HouseRepository;
import com.datasources.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("testService")
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private CityRepository cityRepositorys;
    @Autowired
    private HouseRepository houseRepositorys;

    @Override
    public String test(){

        City city = new City("北京","中国首都");
        cityRepositorys.save(city);

        House house = new House("豪宅","特别大的豪宅");
        houseRepositorys.save(house);

        return "成功";
    }
}
