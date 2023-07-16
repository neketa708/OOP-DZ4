package org.example;

import java.util.List;

public class Calcul {
    public double sum(List<? extends Number> numbers){ //дает возможность использовать любой тип наследника Number
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
    public double multiplication(List<? extends Number> numbers){
        double multiplication = 1.0;
        for (Number number : numbers) {
            if (number.doubleValue()==0){
                multiplication *= 1;
            }else
            multiplication *= number.doubleValue();
        }
        return multiplication;
    }

    public double division(List<? extends Number> numbers,List<? extends Number> numbers2){
        double sum = 0.0;
        double sum2 = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        for (Number number : numbers2) {
            sum2 += number.doubleValue();
        }
        return sum/sum2;
    }
}
