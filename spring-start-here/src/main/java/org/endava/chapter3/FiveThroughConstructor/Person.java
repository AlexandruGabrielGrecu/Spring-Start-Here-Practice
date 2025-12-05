package org.endava.chapter3.FiveThroughConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name ="Ella";

    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    /**
     * NOTE Starting with Spring version 4.3,
     * when you only have one constructor in the class, you can omit writing the @Autowired annotation.
     */
}
