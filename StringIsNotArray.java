/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
public class StringIsNotArray {
   public static void main(String[] args){
       String s = "Enjoy Life!";
       for(int i = 0; i< s.length(); i++){
            System.out.println("s[" + i + "]:" + s[i]); // throws out error
        }
   }
    
}
