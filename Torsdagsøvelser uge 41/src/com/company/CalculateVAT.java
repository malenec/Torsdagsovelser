package com.company;

public class CalculateVAT {

    final static int PRCVAT = 25;

    public CalculateVAT() {
    }

    public static double doVAT(double number){
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
