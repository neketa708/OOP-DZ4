package org.example;

public class BinaryCalculaltor {
    private String binary1;
    private String binary2;
    private int decimal1;
    private int decimal2;

    public BinaryCalculaltor(String binary1, String binary2) {
        this.binary1 = binary1;
        this.binary2 = binary2;
        this.decimal1 = Integer.parseInt(binary1,2);
        this.decimal2 = Integer.parseInt(binary2,2);
    }
    public String summ(){
        int sumDecimal = decimal1+decimal2;
        return Integer.toBinaryString(sumDecimal);
    }
    public String substraction(){
        int subDecimal = decimal1-decimal2;
        return Integer.toBinaryString(subDecimal);
    }
    public String multiply(){
        int mulDecimal = decimal1*decimal2;
        return Integer.toBinaryString(mulDecimal);
    }
    public String divide(){
        int divDecimal = decimal1/decimal2;
        return Integer.toBinaryString(divDecimal);
    }
}
