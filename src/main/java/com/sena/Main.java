package com.sena;

import com.sena.proxies.EmailCommentNotificationProxy;
import com.sena.repositories.DBCommentRepository;
import com.sena.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var comment = new Comment("Abdullah", "First comment!");

        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        commentService.publishComment(comment);
    }
}