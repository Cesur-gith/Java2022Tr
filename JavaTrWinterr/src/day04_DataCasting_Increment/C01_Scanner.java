package day04_DataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

//        Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");

        char firstLetter = scan.next().charAt(0);
        System.out.println("Girdiginiz ismin: " + firstLetter);






    }
}
