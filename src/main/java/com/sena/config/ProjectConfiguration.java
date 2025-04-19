package com.sena.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.sena.proxies", "com.sena.repositories", "com.sena.services"})
public class ProjectConfiguration {
}
