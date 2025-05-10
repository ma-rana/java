/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java001;
import java.util.*;

/**
 *
 * @author basantaranamagar
 * 
 */
public class Java001 {

    public static void main (String[] args){
//        System.out.println("I Rule");
//        System.out.println("The world!");
          int x = 3;
          String name = "Dirk";
          x = x*17;  //3*17 = 51
          System.out.println("x is " + x);
//          double d = Math.random();
//          System.out.println(d);
          if (x == 10){
              System.out.println("x must be 10.");
          }else{
              System.out.println("x isn't 10.");
          }
          if((x < 3) & (name.equals("Dirk"))){
              System.out.println("Gently");
          }
          System.out.println("This line runs no matter what");
          int new_num = 4;
          while (new_num > 3){
              new_num = new_num - 1;
              System.out.println(new_num);
          }
    }
}