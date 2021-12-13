package com.virtualmachine.sayan;

public class SpeedConverter {

    public static void main(String[] args) {

        long rounded = toMilesPerhour(10);
        printConversion(2);

    }
    public static long toMilesPerhour(double kilometresperHour) {

        if(kilometresperHour < 0){
            return -1;
        }

        long milesperhour = Math.round(kilometresperHour / 1.609);
        return milesperhour;
    }
    public static void printConversion(double kilometresperHour){

        if(kilometresperHour < 0){
            System.out.println("Invalid Value");
        }
        else{
            long milesperhour = toMilesPerhour(kilometresperHour);
            System.out.println(kilometresperHour + " km/h to " +milesperhour + " mi/h");
        }
    }
}

