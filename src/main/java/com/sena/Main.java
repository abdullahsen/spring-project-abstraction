package com.sena;

import com.sena.config.ProjectConfiguration;
import com.sena.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var commentService = context.getBean(CommentService.class);
        var comment = new Comment("Abdullah", "Second comment!");
        commentService.publishComment(comment);
    }
}