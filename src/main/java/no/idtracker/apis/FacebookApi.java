package main.java.no.idtracker.apis;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import main.java.no.idtracker.models.Comment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FacebookApi implements API {

    private static final String FILE_NAME = "src/resources/facebook.txt";

    @Override
    public List<Comment> getComments() {
        List<Comment> comments = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            while (br.ready()) {
                comments.add(new Comment(
                        br.readLine().trim(),
                        br.readLine().trim(),
                        new ArrayList<String>() {{
                            add(br.readLine().trim());
                        }}
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return comments;
    }
}
