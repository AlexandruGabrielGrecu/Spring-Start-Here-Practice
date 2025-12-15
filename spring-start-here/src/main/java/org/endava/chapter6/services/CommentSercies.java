package org.endava.chapter6.services;

import org.endava.chapter6.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentSercies {
    private Logger logger = Logger.getLogger(CommentSercies.class.getName());

    public void publishComment(Comment comment){
        logger.info("PUBLISHING COMMENT " + comment.getText());

    }
}
