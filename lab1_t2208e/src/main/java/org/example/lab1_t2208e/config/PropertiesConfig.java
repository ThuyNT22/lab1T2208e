package org.example.lab1_t2208e.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties")
public class PropertiesConfig {
    // This class enables the custom config.properties file
}

