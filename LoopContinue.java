/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
public class LoopContinue {
    public static void main(String[] args){
        for(int i = 1; i<=10; i++){
            if(i == 6) continue;
            System.out.println(i);
        }
    }
}
