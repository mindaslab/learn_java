/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
public class Circle {
    static double circle_area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public static void main(String[] args){
        int radius = 5;
        System.out.println("Area of circle: " + circle_area(radius));
    }
    
}
