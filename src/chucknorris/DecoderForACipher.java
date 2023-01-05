package chucknorris;

import java.util.ArrayList;
import java.util.Scanner;
public class DecoderForACipher {

    public static String ConvertCipherToBinary(String input) {
        String[] listOfStrings = input.split(" ");
        StringBuilder inputNew = new StringBuilder();
        for (int i = 1; i < listOfStrings.length; i += 2) {
            if (listOfStrings[i - 1].equals("0")) {
                for (int j = 0; j < listOfStrings[i].length(); j++) {
                    System.out.print("1");
                    inputNew.append("1");
                }
            } else if (listOfStrings[i - 1].equals("00")) {
                for (int j = 0; j < listOfStrings[i].length(); j++) {
                    System.out.print("0");
                    inputNew.append("0");
                }
            }
        }
        return  inputNew.toString();
    }

    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String result = """
                                
                The result:""";
        System.out.println(result);
        ConvertCipherToBinary(input1);
    }
}