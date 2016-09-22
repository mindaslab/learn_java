/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
public class WhileLoopManyVariables {

    public static void main(String[] args) {
        int i = 1; // Initalization
        int j = 2;
        while (i <= 10 && j <= 15) {
            System.out.println("i = " + i); // loop body
            System.out.println("j = " + j);
            i++; // updatiopn
            j = j + 3;
        }
    }
}
