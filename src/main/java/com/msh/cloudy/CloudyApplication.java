package com.msh.cloudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class CloudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudyApplication.class, args);
	}
	
	 @Bean
	    public FilterRegistrationBean simpleCorsFilter() {  
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
	        CorsConfiguration config = new CorsConfiguration();  
	        config.setAllowCredentials(true); 
	        // *** URL below needs to match the Vue client URL and port ***
	        List<String> allowedURLS = new ArrayList<String>();
	        allowedURLS.add("http://localhost:8080");
	        allowedURLS.add("http://192.168.43.132:9999");
	        allowedURLS.add("*");
	        config.setAllowedOrigins(allowedURLS);
	       // config.setAllowedOrigins(Collections.singletonList("http://localhost:8080")); 
	        //config.setAllowedOrigins(Collections.singletonList("http://192.168.1.3:9999"));
		      
	        config.setAllowedMethods(Collections.singletonList("*"));  
	        config.setAllowedHeaders(Collections.singletonList("*")); 
	        
	        
	        source.registerCorsConfiguration("/**", config);  
	        FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);  
	        return bean;  
	    } 

}
