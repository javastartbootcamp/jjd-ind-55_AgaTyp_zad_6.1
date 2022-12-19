package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner guess = new Scanner(System.in);

        final int number = 120;
        int userGuess;

        System.out.println("Podaj liczbę");

        while ((userGuess = guess.nextInt()) != number) {
            if (userGuess % 3 != 0) {
                System.out.println("Liczba nie jest podzielna przez 3");
            } else if (userGuess < number) {
                System.out.println("Podana liczba jest za mała");
            } else {
                System.out.println("Podana liczba jest za duża");
            }
            System.out.println("Podaj liczbę");
        }

        System.out.println("Twoja liczba jest ok");

    }
}
