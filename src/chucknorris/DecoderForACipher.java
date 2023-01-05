package chucknorris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DecoderForACipher {

    public static String ConvertCipherToBinary(String input) {
        String[] listOfStrings = input.split(" ");
        StringBuilder inputNew = new StringBuilder();
        for (int i = 1; i < listOfStrings.length; i += 2) {
            if (listOfStrings[i - 1].equals("0")) {
                for (int j = 0; j < listOfStrings[i].length(); j++) {
                    inputNew.append("1");
                }
            } else if (listOfStrings[i - 1].equals("00")) {
                for (int j = 0; j < listOfStrings[i].length(); j++) {
                    inputNew.append("0");
                }
            }
        }
        return  inputNew.toString();
    }
    public static char ConvertBinaryToChar(String input){
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int number = character - 48;
            if (number == 1) {
                counter += Math.pow(2, input.length() - 1 - i);
            }
        }
        return (char) counter;
    }
/*    public static void ConvertBinaryToString(String input) {
        if ((input.length() % 7) == 0) {
            int substringSize = 7;
            ArrayList<String> listOfSubstrings = new ArrayList<>();
            for (int i = 0; i < input.length(); i += substringSize) {
                String element = input.substring(i, Math.min(i + substringSize, input.length()));
                listOfSubstrings.add(element);
            }
            for (String variable : listOfSubstrings
            ) {
                char character = ConvertBinaryToChar(variable);
                System.out.print(character);

            }
        }
        else {
            int substringSize = 7;
            ArrayList<String> listOfSubstrings = new ArrayList<>();
            for (int i = input.length(); i >= 0; i -= substringSize) {
                String element = input.substring(i - 7, i);
                listOfSubstrings.add(element);
            }
            Collections.reverse(listOfSubstrings);
            for (String variable : listOfSubstrings
            ) {
                char character = ConvertBinaryToChar(variable);
                System.out.print(character);

            }

        }
    }*/
    public static void ConvertBinaryToString(String input) {
        int substringSize = 7;
        ArrayList<String> listOfSubstrings = new ArrayList<>();
        for (int i = input.length(); i > 0; i -= substringSize) {
            String element = input.substring(i - 7, i);
            listOfSubstrings.add(element);
        }
        Collections.reverse(listOfSubstrings);
        for (String variable : listOfSubstrings
        ) {
            char character = ConvertBinaryToChar(variable);
            System.out.print(character);

        }
    }

    public static void main(String[] args) {
        System.out.println("Input string:");
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String result = """
                                
                The result:""";
        System.out.println(result);
        ConvertBinaryToString(ConvertCipherToBinary(input1));
    }
}