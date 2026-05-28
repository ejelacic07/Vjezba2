package Izbacivac;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int dob;
       System.out.println("Dobrodošli u Club Java. ");

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite svoje godine: ");
        dob = input.nextInt();

        try {
          provjeriDob(dob);
        } catch (IllegalArgumentException e) {
             System.out.println(e.getMessage());
        }

    }

    public static void provjeriDob(int dob) throws IllegalArgumentException {
         if (dob < 18) {
            throw new IllegalArgumentException("Ulaz zabranjen. Premlad za ulazak.");
         }
         System.out.println("Dobrodošli u klub!");
    }
}
