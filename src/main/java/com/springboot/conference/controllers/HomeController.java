package com.springboot.conference.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {
    @Value("${spring.application.version}")
    private String appVersion;

    @GetMapping
    @RequestMapping("/")
    public Map<String, String> getStatus() {
        Map<String, String> map = new HashMap<>();
        map.put("app-version", appVersion);

        return map;
    }

}
