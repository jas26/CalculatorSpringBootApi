package com.example.Caluculator.Cal.CalFunctions;

import java.util.List;

public class Calculater {
    public int addEle(int num1, int num2){
        return num1 + num2;
    }
    public int subEle(int num1, int num2){
        return num1 - num2;
    }
    public int mulEle(int num1, int num2){
        return num1 * num2;
    }
    public int divEle(int num1, int num2){
        if(num2 == 0){
            throw new ArithmeticException("/ by zero");
        }
        return num1 / num2;
    }

}
