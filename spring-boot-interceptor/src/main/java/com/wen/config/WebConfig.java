package com.wen.config;

import com.wen.interceptor.BrushInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * BrushInterceptor 注册到springboot里
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private BrushInterceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor);
    }
}
