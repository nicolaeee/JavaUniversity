

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
    Scanner nrIntreg = new Scanner(System.in);

    System.out.println("Introdu un numar intreg: ");

    //sa se afiseze toti divizori unui numar intreg dat ca parametru in linia de comanda
    int num = nrIntreg.nextInt();

     for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println("Numarul: " + num + " are divizorii comuni: " + i);
                }



        }
    }
}