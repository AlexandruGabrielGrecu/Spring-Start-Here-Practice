package org.endava.chapter4.firstWithoutSpring;

public class EmailCommentNotificationProxy
        implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: "
                + comment.getText());
    }
}
