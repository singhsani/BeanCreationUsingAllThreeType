package org.example.impl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * interface base implementation bean
 */
//public class Employee implements InitializingBean, DisposableBean {
//    private int id;
//    private String name;
//    private String lastName;
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy objects");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("initilization complete");
//    }
//}

/**
 * anotation base bean implementation
 */
public class Employee {
    private int id;
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("destroy objects");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("initilization complete");
    }
}
