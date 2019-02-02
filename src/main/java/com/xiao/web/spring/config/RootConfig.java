package com.xiao.web.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * RootConfig
 *
 * @author : Gang
 * @date : 2019/2/2
 */
@Configuration
@ComponentScan(basePackages = {"com.xiao.web.spring"},
excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
})
public class RootConfig {
}
