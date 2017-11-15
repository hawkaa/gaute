package main.java.no.idtracker.storage;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import main.java.no.idtracker.models.Comment;

import java.util.List;

public class DatabaseCommentStorage implements CommentStorage {

    public static final String DATABASE_CONNECTION_STRING = "boeuleboulgdeoulgcedougdoeugdeou";

    @Override
    public void saveComments(List<Comment> comments) {
        // TODO: Save the comments in the database
    }
}
