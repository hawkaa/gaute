package main.java.no.idtracker.models;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import java.util.List;

public class Comment {
    private final String commentId;
    private final String authorId;
    private final List<String> comment;

    public String getCommentId() {
        return commentId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public List<String> getComment() {
        return comment;
    }

    public Comment(String commentId, String authorId, List<String> comment) {
        this.commentId = commentId;
        this.authorId = authorId;
        this.comment = comment;
    }

    public String toJson() {
        return "{ \"commentId\": " + this.commentId + "\", \"authorId\": \"" + authorId + "\"}";
    }

}
