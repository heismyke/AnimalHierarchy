/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.animalhierarchy.animals;
import com.animalhierarchy.animals.Animals;
/**
 *
 * @author myke
 */
public class Dog extends Animals{
  
   public Dog(String name, int age){
       super(name,age);
       
    }
    @Override
      public void makeSound() {
        System.out.println("The dog barks");
    }
    public String getSound() {
        return "The dog barks";
    }
}
