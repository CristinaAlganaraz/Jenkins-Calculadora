/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author crist
 */
public class Calc {
     private int num1;
    private int num2;

    public Calc() {
    }

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int suma() {
        return num1 + num2;
    }
    
    public int resta() {
        return num1 - num2;
    }
    
    public int multiplicacion() {
        return num1 * num2;
    }
    
    public int division() {
        return num1 / num2;
    }
}
