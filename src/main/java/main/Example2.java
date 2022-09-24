package main;

import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.VehicleServices;

public class Example2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving the Person bean from the Spring Context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context");
    }
}