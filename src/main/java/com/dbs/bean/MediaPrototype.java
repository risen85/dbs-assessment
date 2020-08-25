package com.dbs.bean;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Slf4j
public class MediaPrototype {
    private String name;
    @Autowired
    private PetProjectSingleton petProjectSingleton;

    public void publish(){
        String message = new StringBuilder()
                .append(petProjectSingleton.getName())
                .append(" has been published to ")
                .append(this.name)
                .toString();
        log.info(message);
    }
}
