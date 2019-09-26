package com.stackroute;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {

    @Override
    public void postProcessorAfterInitializtion()
    {
        System.out.println("bean initialized");

    }
    @Override
    public void postProcessorBeforeInitializtion()
    {
        System.out.println("bean destroyed");
    }


}