package com.wuniu.printmanage.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Yan
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    //  @Autowired
    //  AuthInterceptor authInterceptor

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //    registry.addInterceptor(authInterceptor)
        //        .addPathPatterns("/**")
        //        .excludePathPatterns("/login", "/register")
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("OPTIONS", "GET", "POST", "PUT", "DELETE")
            .allowCredentials(true)
            .maxAge(3600);
    }
}
