package io.github.willem_merwe;
import java.util.Scanner;

public class ChallengeOnetoTen {
    public static void challengeOne(){
        Scanner sc = new Scanner(System.in);
        String input[] = new String[3];
        String dictionary[] = {"What is your name: ", "How old are you: ", "What is your Reddit Username: "};

        for (int i = 0; i < 3; i++){
            System.out.print(dictionary[i]);
            input[i] = sc.nextLine();
        }

        System.out.println("\nYour name is " + input[0] +
                ". You are " + input[1] + " years old" +
                " and your Reddit username is " + input[2] + ".");
    }
}
