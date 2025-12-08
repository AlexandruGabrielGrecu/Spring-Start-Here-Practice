package org.endava.chapter4.thirdWIthAutowired;

import org.springframework.stereotype.Component;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "Sending notification for comment: " +
                        comment.getText());
    }
}