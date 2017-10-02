package com.example.ldydo.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by DydoLE on 02.10.2017.
 */
@SpringBootApplication
@EnableEurekaClient
public class AuthorizationServerDemo {

  public static void main(String[] args) {
    SpringApplication.run(AuthorizationServerDemo.class, args);
  }
}
