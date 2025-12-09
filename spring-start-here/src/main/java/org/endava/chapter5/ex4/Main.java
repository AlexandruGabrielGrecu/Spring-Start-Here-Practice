package org.endava.chapter5.ex4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("before constructing bean commentService");
        var commentService = context.getBean(CommentService.class);
        System.out.println("after constructing bean commentService");
    }
}