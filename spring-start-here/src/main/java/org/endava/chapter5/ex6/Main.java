package org.endava.chapter5.ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var userService = context.getBean(UserService.class);
        var commentService = context.getBean(CommentService.class);

        System.out.println(userService.getCommentRepository() == commentService.getCommentRepository());
    }
}
