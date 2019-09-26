package com.stackroute.domain;

import com.stackroute.domain.Actor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;

public class Movie  {

    private Actor actor;
    ApplicationContext object;
    private Movie movieobject;

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


    public void showMovieobject() { System.out.println(movieobject.toString()); }

    public void displayActor()
    {
        System.out.println(actor.getName());
    }


//    @Override
//    public void setApplicationContext(ApplicationContext ap) throws BeansException {
//           this.object=ap;
//
//           movieobject=(Movie)object.getBean("movieA");movieA
//    }

//    @Override
//    public void setBeanName(String s) {
//
//    }
}
