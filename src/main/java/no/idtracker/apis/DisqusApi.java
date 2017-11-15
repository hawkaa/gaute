package main.java.no.idtracker.apis;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import main.java.no.idtracker.models.Comment;

import java.util.ArrayList;
import java.util.List;

public class DisqusApi implements API {
    @Override
    public List<Comment> getComments() {
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("1", "5", new ArrayList<String>() {{
            add("Haha din duts");
            add("Haha din dust");
        }}));

        comments.add(new Comment("2", "3", new ArrayList<String>() {{
            add("denne kommentaren kommer fra DisqusApi");
        }}));

        return comments;
    }
}
