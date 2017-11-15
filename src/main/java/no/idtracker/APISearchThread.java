package main.java.no.idtracker;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import main.java.no.idtracker.apis.API;
import main.java.no.idtracker.models.Comment;

public class APISearchThread {

    public APISearchThread(API api) {
        this.api = api;
    }

    private final API api;

    public void run() {
        while (true) {
            for (Comment c: api.getComments()) {
                System.out.println(c.toJson());
            }
        }
    }
}
