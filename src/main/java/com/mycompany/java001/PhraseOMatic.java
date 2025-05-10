/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java001;

/**
 *
 * @author basantaranamagar
 */
public class PhraseOMatic {
    public static void main (String[] args){
        String[] wordListOne = {"24/7","multi-Tier","30000,foot","B-to-B","win-win","front-end", "web-based","pervasive","smart","six-sigma","ceitical-path","dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "cenctric", "distributed","clustered", "branded", "outsided-the-box","positioned","networked","focused","leveraged","aligned","targeted","shared","coorperative","accelerated"};
        String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mainshare","portal","space","vision","paradigm","mission"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //random 3 numbers
        int rand1 = (int) (Math.random()*oneLength); // (int) round the number into real (int) number and after "*" is the maximum value for random value
        int rand2 = (int) (Math.random()*twoLength);
        int rand3 = (int) (Math.random()*threeLength);
        //Connecting words
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println(phrase);
    }
}
