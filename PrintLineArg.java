/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ak
 */
public class PrintLineArg {
    public static void printLine(String a) {
        for (int i = 1; i <= 50; i++) {
            System.out.print(a);
        }
        System.out.println();
    }

    public static void main(String[] f) {
        printLine("*");
        printLine("&");
    }
}
