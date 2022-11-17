package com.example.config;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
public class SeguridadConfig {

//    @Value("${usr}")
//    private String usr;
//
//    @Value("${pass}")
//    private String pass;
//
//    @Bean
//    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
//        UserDetails oDetails = User.withDefaultPasswordEncoder()
//                .username(usr)
//                .password(pass)
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(oDetails);
//    }
//
//    @Bean
//    public SecurityFilterChain configure(HttpSecurity httpSecurity) throws Exception{
//        return httpSecurity.csrf().disable()
//                .authorizeHttpRequests()
//                .antMatchers("/personas/**")
//                .authenticated()
//                .and()
//                .httpBasic(Customizer.withDefaults())
//                .build();
//
//    }
}
