package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = """
                
                The result:""";
        System.out.println(result);
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i);
            int size = Integer.toBinaryString(number).length();
            if (size == 7) {
                System.out.println(input.charAt(i) + " = " + Integer.toBinaryString(number));
            } else {
                for (int j = size; j < 7; j++) {
                    System.out.println(input.charAt(i) + " = " + "0" + Integer.toBinaryString(number));
                }

            }
        }
    }
}
