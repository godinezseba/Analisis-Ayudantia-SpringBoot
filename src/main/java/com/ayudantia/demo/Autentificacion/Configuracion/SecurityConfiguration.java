package com.ayudantia.demo.Autentificacion.Configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.csrf().disable();
        http.authorizeRequests().
            antMatchers("/v1/torneo").hasRole("ADMIN").
            antMatchers("/v1/equipo").hasRole("USER").
            antMatchers("/").permitAll().
            anyRequest().authenticated().
            and().httpBasic();
    }

    @Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("test").password("{noop}holamundo").roles("USER");
	}

}