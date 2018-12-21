package com.example.demo.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;


@Component


@ConfigurationProperties(prefix = "student")


@Validated



//@PropertySource(value = {"classpath:fix.properties"})
public class Student {

//    @Value("杨廷耀")
    private String name;
//    @Value("23")
    private int age;

    @javax.validation.constraints.Email
    private String Email ;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }



}


