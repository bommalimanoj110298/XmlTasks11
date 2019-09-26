package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.annotation.Autowired;

public class Movie {
   private Actor actor;

    public Movie()
    {

    }


    public Movie(Actor actor)
    {

        this.actor=actor;
        System.out.println("jj");
    }

    @Autowired
    public void setActor(Actor actor) {
        this.actor = actor;
  }
    public void displayActor()
    {
        System.out.println(actor.getName());
    }






}
