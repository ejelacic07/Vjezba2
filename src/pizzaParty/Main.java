package pizzaParty;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

         int brojPizza;
         int brojLjudi;

        Scanner input = new Scanner(System.in);
        System.out.print("Koliko je pizza naručeno? ");
        brojPizza = input.nextInt();

        System.out.print("Koliko je ljudi na zabavi? ");
        brojLjudi = input.nextInt();

        try {
            izracunajSnite(brojPizza, brojLjudi);
        } catch (ArithmeticException e) {
            System.err.println("Greška: Ne možemo podijeliti pizzu na 0 ljudi." );
        } catch (InputMismatchException e) {
            System.err.println("Greška: Molimo unesite samo cijele brojeve.");
        }
    }



    public static int izracunajSnite(int brojPizza, int brojLjudi) {

          int brojSnita = brojPizza * 8;
          System.out.println("Svaka osoba dobiva " + brojSnita/brojLjudi + " šnita/šnite");

        return brojSnita/brojLjudi;
    }
}