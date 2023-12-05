package com.SpringCore;



import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext app=new ClassPathXmlApplicationContext("com/SpringCore/config.xml");
       Student std1=(Student) app.getBean("student1");
        
        System.out.println(std1);
  Student std2=(Student) app.getBean("student2");
        
        System.out.println(std2);
        
        // using p schema
 Student std3=(Student) app.getBean("student3");
        
        System.out.println(std3);
        
    }
}
