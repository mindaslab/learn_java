/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
class Dog {
    public void speak(){
        System.out.println("Woof");
    }
}

public class DogWorld{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.speak();
    }
}

