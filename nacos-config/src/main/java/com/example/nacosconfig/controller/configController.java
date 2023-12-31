package com.example.nacosconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class configController {

    @Value("${user.name}")
    private String username;

    @RequestMapping("/get")
    public String get() {
        return username;
    }
}