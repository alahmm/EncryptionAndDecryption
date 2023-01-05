package chucknorris;

import java.util.Scanner;

public class LongstWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] listOfString = input.split(" ");
        for (String variable : listOfString
             ) {
            if (variable.length() > listOfString[0].length()) {
                listOfString[0] = variable;
            }
        }
        System.out.println(listOfString[0]);

    }
}
