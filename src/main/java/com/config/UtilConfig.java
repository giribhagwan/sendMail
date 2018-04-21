package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

/**
 * Created by bhagwan on 17/1/17.
 */
@Configuration
public class UtilConfig {

    @Bean
    public Logger getLogger(){
        return  Logger.getLogger(getClass().getName());
    }

}
