/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;

/**
 *
 * @author basantaranamagar
 */
public class Shuffle1 {
    public static void main (String[] args){
        int x = 3;
        if(x >2){
            System.out.print("a");
        }
        while(x > 0){
            
            if(x == 2){
                System.out.print("b c");
            }
            
            x -= 1;
            System.out.print("-");
            
            if(x == 1){
                System.out.print("d\n"); // is add "\n" to avoid "%" interminal
                x -= 1;
            }
            
        }
    }
}
