package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
@RequestMapping("/demo")
public class StartApplication {

    @GetMapping("/data")
    public String index(final Model model) {
        model.addAttribute("title", "I have successfuly built a sprint boot application using Maven");
        model.addAttribute("msg", "This application is deployed on to Kubernetes using Argo CD");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

}
