package org.endava.chapter4.fourthWithMultiplyInterfaceBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

        /**
         *         var commentRepository = new DBCommentRepository();
         *         var commentNotificationProxy = new EmailCommentNotificationProxy();
         *         var commentService = new CommentService(commentRepository, commentNotificationProxy);
         *         vs
         *
         *         var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
         *          var commentService = context.getBean(CommentService.class);
         *
         *
         *
         */
    }
}