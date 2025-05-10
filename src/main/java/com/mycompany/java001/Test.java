/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;

/**
 *
 * @author basantaranamagar
 */
public class Test {
    public static void main(String[] args){
        int x = 0;
        int y = 0;
        while (x < 5){
            //(x)0<5 -> y=0-0 => 0 -> (0,0) A
            //(x)1<5 -> y=1-0 => 1 -> (1,1) A
            //(x)2<5 -> y=2-1 => 1 -> (2,1) A
            //(x)3<5 -> y=3-1 => 2 -> (3,2) A
            //(x)4<5 -> y=4-2 => 2 -> (4,2) A
            //(x)5<5 = X
//            y=x-y; // A

            //0<5 -> y=0+0 = 0 -> (0,0) B
            //1<5 -> y=0+1 = 1 -> (1,1) B
            //2<5 -> y=1+2 = 3 -> (2,3) B
            //3<5 -> y=3+3 = 6 -> (3,6) B
            //4<5 -> y=6+4 = 10 -> (4,10) B
//            y+=x; // B

//            // C
//            y+=2;
//            if(y>4){
//                y-=1;
//            }

//            // D
//            x+=1;
//            y+=x;
//            
//            // E
//            if(y<5){
//                x+=1;
//                if(y<3){
//                    x-=1;
//                }
//            }
//            y+=2;
//            
            System.out.print(x+""+y+" ");
            x+=1;
            //Outout: 00 11 21 32 42 A
            //Output: 00 11 23 36 410 B
            //Output: 02 14 25 36 47 C
            //Outout: 11 34 59 D
            //Output: 02 14 36 48 E
        }
    }
}
