package com.sales.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter
{
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception
	{
		// urls that the user has access to if they have the correct password
		httpSecurity.authorizeRequests().antMatchers("/addBook", "/addCustomer", "/newLoan", "/showBooks", "/showCustomers", "/showLoans", "/deleteLoan")
		.hasRole("USER").and().formLogin().and().logout()
		.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/");
	}// configure
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
		// sets the password and username as well as the role of the user
		auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
	}// configureGlobal
}// Security