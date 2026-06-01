package faktorijel;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int broj = -1;
        boolean validanUnos = false;

        while (!validanUnos) {
            try {
                System.out.print("Unesite neki broj: ");


                if (!unos.hasNextInt()) {
                    String pogresnUnos = unos.nextLine();
                    throw new InputMismatchException("Greška: '" + pogresnUnos.trim() + "' nije broj! Pokušajte ponovno.");
                }

                broj = unos.nextInt();
                unos.nextLine();
                validanUnos = true;

            } catch (InputMismatchException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println("Nepoznata iznimka!");
            }
        }

        try {
            BigInteger rezultat = faktorijel(broj);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Nepoznata iznimka!");
        }

        unos.close();
    }

    public static BigInteger faktorijel(int n) throws IllegalArgumentException {
        provjeriUnos(n);
        BigInteger faktorijel = BigInteger.valueOf(1);

        if(n == 0) {
            faktorijel = BigInteger.valueOf(0);
        }

        for (int i = 1; i <= n; i++) {
            faktorijel = faktorijel.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Faktorijel broja " + n + " je " + faktorijel + ".");
        return faktorijel;
    }


    public static void provjeriUnos(int broj) throws IllegalArgumentException, InputMismatchException {
        if (broj < 0) {
            throw new IllegalArgumentException("Greška: Faktorijel nije definiran za negativne brojeve i nulu!");
        }
        System.out.println("Unos je validan. Broj: " + broj);
    }
    }