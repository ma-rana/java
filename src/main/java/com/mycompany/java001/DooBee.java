/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;

/**
 *
 * @author basantaranamagar
 */
//Must use (while loop)
//Question output: DooBeeDooBeeDo

public class DooBee {
    public static void main(String[] args){
        int x = 1;
        while (x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x += 1;
        }
        if(x == 3){
            System.out.println("Do");
        }
    }
}
