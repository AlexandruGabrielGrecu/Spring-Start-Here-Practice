package org.endava.chapter3.EightCircularDependencies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println(person.getName());
        System.out.println(person.getParrot());
    }
}
