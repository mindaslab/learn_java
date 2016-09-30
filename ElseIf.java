/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
public class ElseIf {
    public static void main(String[] args) {
        int a = 8, b = 5, c = 10;
        if (b > a) {
            System.out.println("b is greater than a");
        }else if (a > c){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("c is greatest");
        }
    }
}
