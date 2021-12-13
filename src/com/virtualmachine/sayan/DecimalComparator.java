package com.virtualmachine.sayan;

public class DecimalComparator {

    public static void main(String[] args){
        boolean val = areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(val);
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        if ( (int) (firstNumber * 1000) == (int) (secondNumber * 1000) ){
            return true;
        }
        else {
            return false;
        }
    }
}
