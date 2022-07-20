package com.english.security;

import com.english.Common.SystemCommon;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http.cors().disable();
            http.authorizeRequests().antMatchers("/vocabulary/*","/user/*").hasAnyRole(SystemCommon.USER)
                                    .antMatchers("/login").permitAll();
    }
}
