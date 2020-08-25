package com.dbs.config;

import com.dbs.bean.MediaPrototype;
import com.dbs.bean.PetProjectSingleton;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public MediaPrototype mediaPrototype() {
        return new MediaPrototype();
    }

    @Bean
    public PetProjectSingleton petProjectSingleton() {
        return new PetProjectSingleton();
    }
}