package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main{

public static void main(String[] args)
{
//    BeanFactory mainclassobject1=new XmlBeanFactory(new ClassPathResource("beans.xml"));
//    Movie movie1 =(Movie)mainclassobject1.getBean("movieobject");
//    movie1.displayActor();

    ApplicationContext mainclassobject=new ClassPathXmlApplicationContext("beans.xml");
                   Movie beanA =(Movie)mainclassobject.getBean("movieA");
                   Movie beanB =(Movie)mainclassobject.getBean("movieB");
                   beanA.displayActor();
                   beanB.displayActor();

//    ApplicationContext mainclassobject2=new ClassPathXmlApplicationContext("beans.xml");
//    Movie beanB =(Movie)mainclassobject2.getBean("movieobject");
//    beanB.displayActor();

    if(beanA==beanB)
    {
        System.out.println("beanA==beanB");
    }else
        System.out.println("notequal");
}


}
