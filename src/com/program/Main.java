/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.program;

import java.util.Scanner;

/**
 *
 * @author Hikmah
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan sisi 1: ");
        double side1 = input.nextDouble();
        System.out.println("Masukkan sisi 2: ");
        double side2 = input.nextDouble();
        System.out.println("Masukkan sisi 3: ");
        double side3 = input.nextDouble();
        
        System.out.println("Masukkan warna: ");
        String color = input.next();
        
        System.out.println("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();
        
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);
        
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
    
}
