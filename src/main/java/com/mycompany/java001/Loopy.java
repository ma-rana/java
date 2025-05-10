/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;

/**
 *
 * @author basantaranamagar
 */
public class Loopy {
    public static void main (String[] args){
        int x = 1;
        System.out.println("Before the Loop: ");
        while (x <= 4){
            System.out.println("In the loop...");
            System.out.println("Value of x is: "+ x);
            x += 1;
        }
        System.out.println("This is afte the loop.");
    }
}
