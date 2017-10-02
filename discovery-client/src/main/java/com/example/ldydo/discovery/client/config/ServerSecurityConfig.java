package com.example.ldydo.discovery.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by DydoLE on 02.10.2017.
 */
@EnableWebSecurity
@Configuration
public class ServerSecurityConfig extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {
    auth.inMemoryAuthentication()
        .withUser("john").password("123").roles("USER");
  }

  @Override
  @Bean
  public AuthenticationManager authenticationManagerBean()
      throws Exception {
    return super.authenticationManagerBean();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.httpBasic().and().authorizeRequests()
        .antMatchers("/health").permitAll()
        .antMatchers("/info").permitAll()
        .anyRequest().authenticated();
//        .and()
//        .formLogin().permitAll();
  }
}
