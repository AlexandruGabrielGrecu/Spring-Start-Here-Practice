package org.endava.chapter3.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot () {
        Parrot parrot = new Parrot();
        parrot.setName("koko");
        return parrot;
    }

    @Bean
    public Person getPerson() {
        Person person = new Person();
        person.setName("Ella");
        person.setParrot(parrot());
        return person;
    }
}
