package org.endava.chapter4.firstWithoutSpring;

public class Main {

    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);

        /**
         * var context =
         *       new AnnotationConfigApplicationContext(
         *         ProjectConfiguration.class);
         *
         *     var comment = new Comment();
         *     comment.setAuthor("Laurentiu");
         *     comment.setText("Demo comment");
         *
         *     var commentService = context.getBean(CommentService.class);
         *     commentService.publishComment(comment);
         *
         *     diferenta e ca tu nu mai stai  sa creezi obiecte pt fiecare
         */
    }
}