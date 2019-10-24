package com.company;
import java.util.Random;

public class ude{
        public static void main(String[] args){
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
        }
}
