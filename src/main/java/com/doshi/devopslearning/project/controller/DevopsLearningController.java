package com.doshi.devopslearning.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class DevopsLearningController {

    @GetMapping("/Start")
    public String start() {
        System.out.println("Flow entered here");
        return "Devops project running";
    }
}
