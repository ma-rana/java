/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;
/**
 *
 * @author basantaranamagar
 */
public class BeerSong {
    public static void main (String[] args){
        int beernum = 99;
        String name = "bottles";
        while(beernum > 0 ){
             name = (beernum == 1) ? "bottle" : "bottles";
//            if(beernum == 1){
//                name = "bottle";
//            }
            System.out.println(beernum + " " + name + " of beer on the wall.");
            System.out.println(beernum + " " + name + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            beernum -= 1;
            if(beernum > 0){
//                name = (beernum == 1) ? "bottle" : "bottles";
                System.out.println(beernum + " " + name + " of beer on the wall.\n");
            }else{
                System.out.println("No more bottles of beer on the wall."); // changes: bottle to bottles
            }
        }
    }
}
