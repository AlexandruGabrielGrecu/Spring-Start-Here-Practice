package org.endava.chapter5.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        CommentService commentService2 = context.getBean(CommentService.class);

        boolean b = commentService == commentService2;
        System.out.println(b);
    }
}