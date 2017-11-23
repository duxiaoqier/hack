package com.bimface.hack.config;

import com.bimface.sdk.BimfaceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dup, 2017-11-22
 */
@Configuration
public class BeanConfig {

    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;

    @Bean
    public BimfaceClient bimfaceClient(){
        return new BimfaceClient(appKey, appSecret);
    }
}
