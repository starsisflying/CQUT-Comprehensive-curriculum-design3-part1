package com.example.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("/**").allowedOrigins("*").allowCredentials(true)
//                .allowedMethods("GET","POST","DELETE","PUT").maxAge(3600);
//    }
}
