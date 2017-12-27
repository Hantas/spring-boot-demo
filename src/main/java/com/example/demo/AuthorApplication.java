package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 10742 on 2017/12/26.
 */
@SpringBootApplication
@RestController
public class AuthorApplication {
    @Autowired
    AuthorSetting authorSetting;
    @RequestMapping("/author")
    public String index(){
        return "author,name: " + authorSetting.getName() + ",age: " + authorSetting.getAge();
    }
    public static void main(String[] args){
        SpringApplication.run(AuthorApplication.class, args);
    }

}
