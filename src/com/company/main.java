package com.company;
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        boolean primeNum = true;

        Scanner key = new Scanner(System.in);

            System.out.println("Would you like to generate a random number or input a number? (R/I)");
            String answer = key.next();
            if (answer.equalsIgnoreCase("i")) {
                System.out.println("Please enter a number:");
                int num = key.nextInt();

                if (num <= 1) {
                    primeNum = false;
                }

                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        primeNum = false;
                        break;
                    }
                }

                if (primeNum)
                    System.out.println(num + " is a prime number");
                else
                    System.out.println(num + " is not a prime number");

            } else if (answer.equalsIgnoreCase("r")) {
                Random r = new Random();
                boolean prime = true;

                int number = r.nextInt(250) ;
                System.out.println("Generated the random number: " + number);

                if (number <= 1) {
                    prime = false;
                }

                for(int i = 2; i <= number / 2; i++)
                {
                    if(number % i == 0)
                    {
                        prime = false;
                        break;
                    }
                }

                if(prime)
                    System.out.println(number + " is a Prime Number");
                else
                    System.out.println(number + " is not a Prime Number");
            } else {
                System.out.println("Invalid answer");
        }
        }
    }