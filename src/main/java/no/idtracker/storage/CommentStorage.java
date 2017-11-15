package main.java.no.idtracker.storage;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import main.java.no.idtracker.models.Comment;

import java.util.List;

public interface CommentStorage {
    void saveComments(List<Comment> comments);
}
