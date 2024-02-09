package org.example.config;

import org.example.interceptor.TokenInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import lombok.extern.slf4j.Slf4j;
@Configuration
@Slf4j
public class WebConfiguration implements WebMvcConfigurer {


    //注册拦截器
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("jinlaile");
        registry.addInterceptor(new TokenInterceptor()) //注册拦截器
                .excludePathPatterns("/login/**")//放过login登录请求
                .addPathPatterns("/**"); //拦截一切请求(任何请求路径)
    }
}
