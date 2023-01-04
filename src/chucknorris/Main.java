package chucknorris;

import java.util.Scanner;
public class Main {
    public static String ConvertStringToBinaryString(String input) {
        String inputNew = "";
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i);
            int size = Integer.toBinaryString(number).length();
            if (size == 7) {
                inputNew += Integer.toBinaryString(number);
            } else {
                for (int j = size; j < 7; j++) {
                    inputNew += "0" + Integer.toBinaryString(number);
                }
            }
        }
        return inputNew;

    }

    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String result = """
                                
                The result:""";
        System.out.println(result);
        String input = ConvertStringToBinaryString(input1);
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int number = character - 48;
            if (i == 0) {
                if (number == 1) {
                    System.out.print(0 + " " + 0);
                } else {
                    System.out.print(0 + "0 " + 0);
                }
            }
            if (i != 0) {
                char character2 = input.charAt(i - 1);
                int number2 = character2 - 48;
                if (number == 1) {
                    if (number2 != 1) {
                        System.out.print(" " + 0 + " " + 0);
                    } else {
                        System.out.print(0);
                    }
                } else if (number == 0) {
                    if (number2 != 0) {
                        System.out.print(" " + 0 + "0 " + 0);
                    } else {
                        System.out.print(0);
                    }
                }
            }
        }
    }
}