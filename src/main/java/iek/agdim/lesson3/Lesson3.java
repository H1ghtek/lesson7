/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package iek.agdim.lesson3;

import java.util.Scanner;

/**
 *
 * @author nikiforos
 */
public class Lesson3 {
    
    static public String name;
    static public int age;
    static public char gender;
    static public double grade;
    public static void main(String[] args) {
         printStats(); //function
       
    
        
    }
     static void printStats(){  //Kaloume function apo thn main
     System.out.println("Πετρος");
     System.out.println(21);
     System.out.println("M");
     System.out.println(8.2);
        Scanner name=new Scanner(System.in);//input
        System.out.print("Dwse to onoma sou:");
        String str=name.next();
        System.out.println("Geia sou" +str);
        Scanner age =new Scanner(System.in);//input
        System.out.print("Dwse thn hlikia sou:");
        int var=age.nextInt();
        Scanner year=new Scanner(System.in);
        System.out.print("Dwse to trexon etos:");
        int abc=year.nextInt();
        int result=abc-var;
        System.out.print("Genithikes to etos:" +result);
        
        
    }
}
