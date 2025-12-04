package org.endava.chapter2.second;

import org.endava.chapter2.second.config.ProjectConfig;
import org.endava.chapter2.second.parrot.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.toString());
        System.out.println(parrot.getName());
    }
}
