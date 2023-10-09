package com.example.javaball;
import com.example.javaball.AirConditioner;

import javax.servlet.http.PushBuilder;

public class HelloResource{
    public static void main(String []args){
        AirConditioner a1 = new AirConditioner(20,5);

        System.out.printf(a1.toString());

    }
}