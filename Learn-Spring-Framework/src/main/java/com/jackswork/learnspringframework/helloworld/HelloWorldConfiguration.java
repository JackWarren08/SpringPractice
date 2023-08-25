package com.jackswork.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address){ };
record Address (String firstLine, String city){ };

@Configuration
public class HelloWorldConfiguration {

  @Bean
  public String name() {
    return "Jack";
  }

  @Bean
  public int age() {
    return 21;
  }

  @Bean
  public Person person() {
    return new Person("matthew", 22, new Address("Main Street", "Newbridge"));
  }

  @Bean
  public Person person2Methods() {
    return new Person(name(), age(), address());
  }

  @Bean
  public Person person2Paramenters(String name, int age, Address CustomName) {
    return new Person(name, age, address2());
  }

  @Bean
  @Primary
  public Person person3Paramenters(String name, int age, Address CustomName) {
    return new Person(name, age, address());
  }

  @Bean
  public Person person4Qualifier(String name, int age, @Qualifier("address2Qualifier")
  Address CustomName) {
    return new Person(name, age, address());
  }

  @Bean(name = "CustomName")
  public Address address(){
    return new Address("Kildare Town", "Kildare");
  }

  @Bean(name = "address2")
  @Qualifier("address2Qualifier")
  public Address address2(){
    return new Address("Tallagh", "Naas");
  }
}
