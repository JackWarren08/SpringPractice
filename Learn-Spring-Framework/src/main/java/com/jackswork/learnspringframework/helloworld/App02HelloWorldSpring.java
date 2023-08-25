package com.jackswork.learnspringframework.helloworld;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

    public static void main(String[] args){

      try(var context =
              new AnnotationConfigApplicationContext
                  (HelloWorldConfiguration.class)) {


        System.out.println(context.getBean("name"));

        System.out.println("\n" + context.getBean("age"));

        System.out.println("\n" + context.getBean("person"));

        System.out.println("\n" + context.getBean("person2Methods"));

        System.out.println("\n" + context.getBean("person2Paramenters"));

        System.out.println("\n" + context.getBean("CustomName"));

        System.out.println("\n" + context.getBean("person4Qualifier"));


        //System.out.println(context.getBean(Address.class));

        //System.out.println
        Arrays.stream(context.getBeanDefinitionNames())
            .forEach(System.out::println);
      }
    }
}
