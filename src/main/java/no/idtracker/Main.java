package main.java.no.idtracker;/*
 * Copyright(c) 2017 Schibsted Media Group. All rights reserved.
 */

import main.java.no.idtracker.apis.API;
import main.java.no.idtracker.apis.DisqusApi;
import main.java.no.idtracker.apis.FacebookApi;
import main.java.no.idtracker.models.Comment;
import main.java.no.idtracker.storage.CommentStorage;
import main.java.no.idtracker.storage.FileCommentStorage;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args)  {
      System.out.println("Helloooo");
      List<API> apis = getApis();

      List<Comment> comments = new ArrayList<>();
      for (API api : apis) {
          for (Comment comment: api.getComments()) {
              comments.add(comment);
          }
      }
      CommentStorage storage = new FileCommentStorage();
      storage.saveComments(comments);

   }



   private static List<API> getApis() {
       List<API> apis = new ArrayList<>();
       apis.add(new DisqusApi());
       apis.add(new FacebookApi());
       return apis;
   }
}
