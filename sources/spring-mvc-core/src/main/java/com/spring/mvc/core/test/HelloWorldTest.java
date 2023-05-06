package com.spring.mvc.core.test;

import com.spring.mvc.core.beans.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
  public static void main(String[] args) {
    // Call Spring container
    ApplicationContext context = new ClassPathXmlApplicationContext("/WEB-INF/spring/appServlet/servlet-context.xml");

    // Request to get SayHello object
    HelloWorld sayHello = (HelloWorld) context.getBean("hello");

    // Call any methods in SayHello object
    sayHello.say();
  }
}
