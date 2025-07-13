package com.example.medical_billing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Apply to all endpoints
                        .allowedOrigins("https://medical-billing-system.netlify.app") // Allow all origins (for dev)
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // All HTTP methods
                        .allowedHeaders("*");
            }
        };
    }
}
