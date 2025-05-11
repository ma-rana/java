/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;

/**
 *
 * @author basantaranamagar
 */
public class PoolPuzzleOne {
    public static void main(String[] args){
        int x = 0;
        while(x<4){//
            System.out.print("a"); // 
            if(x<1){
                System.out.print(" "); // 
            }
            System.out.print("n");//
            if(x>1){//
                System.out.print(" oyster"); // 
                x+=2; // 
            }
            if(x == 1){
                System.out.print("noys"); // 
            }
            if(x<1){//
                System.out.print("oise"); // 
            }
            System.out.println("");
            x+=1;//
        }
    }
}
// Output: 
// a noise
// annoys
// an oyster

