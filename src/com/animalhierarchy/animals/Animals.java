/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.animalhierarchy.animals;

/**
 *
 * @author myke
 */
public class Animals {
    public String name;
    public int age;
    
    Animals(String name, int age){
        this.name = name;
        this. age = age;
    }
      public void makeSound() {
        // Default implementation for making a generic animal sound
        System.out.println("The animal makes a sound.");
    }
      @Override
      public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
