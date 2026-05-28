package faktorijel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         int broj;

         Scanner unos = new Scanner(System.in);
         System.out.print("Unesite neki broj: ");
         broj = unos.nextInt();

         try {
             faktorijel(broj);
         } catch(InputMismatchException e) {
             System.err.println(e.getMessage());
         } catch  (IllegalArgumentException e) {
             System.out.println(e.getMessage());
         } catch (Exception e) {
             System.err.println("Nepoznata iznimka!" );
         }

         unos.close();
    }

    public static int faktorijel(int n) {

        provjeriUnos(n);
        int faktorijel = 1;

        for (int i = 1; i <= n; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel broja " + n + " je " + faktorijel + ".");
        return faktorijel;
    }



    public static void provjeriUnos(int broj) throws InputMismatchException, IllegalArgumentException {

           if(broj < 1) {
                throw new IllegalArgumentException("Greška: Unesen je broj manji od 1. ");
           } else if(!(broj == (int)broj)) {
               throw new InputMismatchException("Greška: Nije unesen cijeli broj!!");
           }

           System.out.print("Unos je veći od 0. ");
    }


}
