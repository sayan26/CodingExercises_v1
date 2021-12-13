package com.virtualmachine.sayan;

public class LeapYear {

    public static void main(String[] args){
        boolean validate = isLeapYear(10000);
        System.out.println(validate);
    }

    public static boolean isLeapYear(int year){
        if(year < 0){
            return false;
        }

        if(year % 4 ==0){
            if(year % 100 ==0) {
                if (year % 400 == 0) {
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
                }
            }
        else{
            return false;
        }
    }
}
