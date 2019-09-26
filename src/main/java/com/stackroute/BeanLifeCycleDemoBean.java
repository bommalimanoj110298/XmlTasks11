package com.stackroute;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.sound.midi.Soundbank;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {

    @Override
    public void destroy() throws Exception {

        System.out.println("Bean Destroyed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("bean initialised");

    }
    public void custonInt()
    {
        System.out.println("bean Initialsed");
    }
    public void customDestroy()
    {

        System.out.println("bean destroyed" );
    }
}
