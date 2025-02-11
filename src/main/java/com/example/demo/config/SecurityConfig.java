//package com.example.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
////@EnableWebSecurity
//@Configuration
//public class SecurityConfig {
//
//@Bean
//public BCryptPasswordEncoder bCryptPasswordEncoder()
//        {
//        return new BCryptPasswordEncoder();
//        }
//
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
////        httpSecurity.authorizeHttpRequests((req)-> req.
////                requestMatchers("/contact").permitAll()
////        .anyRequest().authenticated());
////
////        return httpSecurity.build();
////    }
//
//}
