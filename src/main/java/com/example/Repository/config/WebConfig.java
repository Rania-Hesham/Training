//package com.example.Repository.config;
//
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//public class WebConfig implements WebMvcConfigurer {
//
//    String[] allowedOrigins={"http://localhost:4200","http://google.com"};
//    @Override
//    public void addCorsMappings(CorsRegistry registry){
//        registry.addMapping("//**").allowedOrigins()
//                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS");
//    }
//
//}
