package com.gc.apigateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ZuulConfig {

    @ConfigurationProperties("zuul")
    @RefreshScope
    @Primary
    public ZuulProperties zuulProperties(){
        return  new ZuulProperties();
    }
}
