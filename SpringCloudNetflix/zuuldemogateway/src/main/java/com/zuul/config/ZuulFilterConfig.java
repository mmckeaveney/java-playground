package com.zuul.config;

import com.zuul.filters.PreFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulFilterConfig {

    @Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
}
