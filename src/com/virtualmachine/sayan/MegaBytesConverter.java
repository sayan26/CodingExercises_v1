package com.virtualmachine.sayan;

public class MegaBytesConverter {

    public static void main(String [] args){
        printMegaBytesAndKilobytes(2500);
        printMegaBytesAndKilobytes(-1024);
        printMegaBytesAndKilobytes(5000);
        printMegaBytesAndKilobytes(1024);
        printMegaBytesAndKilobytes(924);

    }
    public static void printMegaBytesAndKilobytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Response");
        }
        else {
            int megabytes = kiloBytes / 1024;
            int kilobytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB And " + kilobytes + " KB");
        }
    }
}
