package com.nigel.SpringCoreDemo.config;

import com.nigel.SpringCoreDemo.common.Coach;
import com.nigel.SpringCoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
