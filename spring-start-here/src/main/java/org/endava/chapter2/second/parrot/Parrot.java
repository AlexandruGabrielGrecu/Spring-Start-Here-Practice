package org.endava.chapter2.second.parrot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    @PostConstruct
    public void init() {
        this.name = "gabi";
    }

    @PreDestroy
    public void destroy() {
        //something
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
