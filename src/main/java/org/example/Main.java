package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calcul calcul = new Calcul();
        List<Integer> listInt = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Number> numberList = new ArrayList<>();
        for (int i =0; i<5;i++){
            listInt.add(i);
            doubleList.add(((double) i));
            numberList.add(i);
        }
        for (int i =0; i<3;i++){
            floatList.add(((float) i));
        }
        System.out.println(calcul.sum(doubleList));
        System.out.println(calcul.multiplication(numberList));
        System.out.println(calcul.division(doubleList,floatList));

        BinaryCalculaltor binaryCalculaltor = new BinaryCalculaltor("101","11");
        System.out.println("сумма "+binaryCalculaltor.summ());
        System.out.println("вычитание "+binaryCalculaltor.substraction());
        System.out.println("умножение "+binaryCalculaltor.multiply());
        System.out.println("деление "+binaryCalculaltor.divide());
    }
}