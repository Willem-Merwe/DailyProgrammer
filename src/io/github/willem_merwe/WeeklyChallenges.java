package io.github.willem_merwe;

import java.util.Scanner;

public class WeeklyChallenges {

    /*
    Willem-Merwe Joubert 5/5/2018
    Write a program that takes in a numerical value, then reads in user input from
    the console a number of times equal to the number. Then print all the inputs.
    */
    public static void weeklyChallengeOne(){
        System.out.print("Enter the number of items you would like to add: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String list[] = new String[num];

        for(int i = 0; i < num; i++) {
            System.out.print("Enter your String Input: ");
            String input = sc.next();
            list[i] = input;
        }

        System.out.println("\nYour List Included: ");
        for(int i = 0; i < num; i++) {
            System.out.println((i+1)+"."+list[i]);
        }
    }
}
