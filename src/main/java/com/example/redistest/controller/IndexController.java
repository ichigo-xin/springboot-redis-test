package com.example.redistest.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/index")
    public String index() {
        String value = stringRedisTemplate.opsForValue().get("hu");
        log.info("从redis中获取的hu = {}", value);
        return value;
    }


}
