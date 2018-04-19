/*
 * |-------------------------------------------------
 * | Copyright © 2018 Colin But. All rights reserved. 
 * |-------------------------------------------------
 */
package com.mycompany.presents.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //
        // Access Bootstrap static resource:
        //
        // http://somedomain/SomeContextPath/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css
        //
        registry.addResourceHandler("/webjars/**") //
            .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

}
