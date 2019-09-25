package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {
    Actor actor;

    public Movie(Actor actor)
    {

        this.actor=actor;
    }


//    public void setActor(Actor actor) {
//        this.actor = actor;
//    }
    public void displayActor()
    {
        System.out.println(actor.getName());
    }






}
