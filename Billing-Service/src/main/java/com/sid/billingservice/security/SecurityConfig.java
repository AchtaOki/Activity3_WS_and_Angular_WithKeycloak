package com.sid.billingservice.security;

//import org.keycloak.adapters.springsecurity.KeycloakConfiguration;
//import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
//import org.springframework.security.core;
//import org.springframework.security.access;
//import org.springframework.security.authentication
//import org.springframework.security.web;
//@KeycloakConfiguration
//@EnableGlobalMethodSecurity(prePostEnabled = true)

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {


  @Bean
   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
       http.csrf().disable()
               .authorizeHttpRequests()
               .requestMatchers("/h2-console/**")
               .permitAll()
               .anyRequest()
               .authenticated()
               .and()
               .formLogin();
       //http.headers().frameOptions().disable();
       ;
     //  http.authenticationProvider(authenticationProvider());
       //http.authorizeHttpRequests().anyRequest().authenticated();
       return http.build();
   }




  /*  @Bean
    public AuthenticationManager authenticationManager(
            AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }
    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();


        return authProvider;
    }*/
   /* @Override
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
    }
    @Bean
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
  auth.authenticationProvider(keycloakAuthenticationProvider());
  }*/
    /*@Bean
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
        http.csrf().disable();
        http.authorizeHttpRequests().anyRequest().authenticated();
    }

    @Override
    public void init(WebSecurity builder) throws Exception {

    }

    @Override
    public void configure(WebSecurity builder) throws Exception {

    }*/




    }




