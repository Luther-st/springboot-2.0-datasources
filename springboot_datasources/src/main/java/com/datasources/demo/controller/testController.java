package com.datasources.demo.controller;

import com.datasources.demo.entity.one.City;
import com.datasources.demo.entity.two.House;
import com.datasources.demo.repository.one.CityRepository;
import com.datasources.demo.repository.two.HouseRepository;
import com.datasources.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class testController {

    @Autowired
    private TestService tService;

    @RequestMapping("/testData")
    @ResponseBody
    public String testData()throws Exception{

        return tService.test();
    }

}
