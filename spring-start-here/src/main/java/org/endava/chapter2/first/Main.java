package org.endava.chapter2.first;

import org.endava.chapter2.first.coco.Coco;
import org.endava.chapter2.first.coco.Ruster;
import org.endava.chapter2.first.config.ProjectConfig;
import org.endava.chapter2.first.parrot.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.toString());
        System.out.println(parrot.getName());

        Integer integer = context.getBean(Integer.class);
        System.out.println(integer);
        String string = context.getBean(String.class);
        System.out.println(string);

        Coco coco = context.getBean("coco2", Coco.class);
        System.out.println(coco.toString());
        System.out.println(coco.getName());

        Ruster ruster = context.getBean(Ruster.class);
        System.out.println(ruster.getName());
        ruster.setName("aaaa");
        System.out.println(ruster.getName());
        System.out.println(ruster.toString());

        Coco coco2 = context.getBean(Coco.class);
        System.out.println(coco2.toString());
        System.out.println(coco2.getName());
    }
}
