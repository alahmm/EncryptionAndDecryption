package chucknorris;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class EncoderAndDecoderChuckNorris {
    /**
     * the functions defined here will be used for encoding
     */
    public static String ConvertStringToBinaryString(String input) {
        StringBuilder inputNew = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            int number = input.charAt(i);
            int size = Integer.toBinaryString(number).length();
            if (size == 7) {
                inputNew.append(Integer.toBinaryString(number));
            } else {
                for (int j = size; j < 7; j++) {
                    inputNew.append("0").append(Integer.toBinaryString(number));
                }
            }
        }
        return inputNew.toString();

    }
    public static  void ConvertBinaryToCipher (String input) {
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

    /**
     * the functions defined here will be used for decoding
     * @param input
     * @return
     */
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
        System.out.println("Please input operation (encode/decode/exit):");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("encode")) {
                System.out.println("Input string:");
                String inputNext = scanner.nextLine();
                System.out.println("Encoded string:");
                String input2 = ConvertStringToBinaryString(inputNext);
                ConvertBinaryToCipher(input2);
                String text = """
                        
                        Please input operation (encode/decode/exit):""";
                System.out.println(text);
            } else if (input.equals("decode")) {
                System.out.println("Input encoded string:");
                String inputNext = scanner.nextLine();
                String[] listOfStrings = inputNext.split(" ");
                boolean isNot0 = false;
                for (String variable : listOfStrings
                     ) {
                    for (int i = 0; i < variable.length(); i++) {
                        char character = variable.charAt(i);
                        if (character != '0') {
                            isNot0 = true;
                        }
                    }

                }
                if (isNot0 || (!listOfStrings[0].equals("0") && !listOfStrings[0].equals("00")) ||
                        listOfStrings.length % 2 != 0) {
                    System.out.println("Encoded string is not valid.");
                    String text = """
                        
                        
                                            Please input operation (encode/decode/exit):""";
                    System.out.println(text);
                } else if (!isNot0) {
                    String binary = ConvertCipherToBinary(inputNext);
                    if (binary.length() % 7 != 0) {
                        System.out.println("Encoded string is not valid.");
                        String text = """
                        
                        
                                            Please input operation (encode/decode/exit):""";
                        System.out.println(text);
                    } else {
                        System.out.println("Decoded string:");
                        ConvertBinaryToString(binary);
                        String text = """
                        
                        
                        Please input operation (encode/decode/exit):""";
                        System.out.println(text);
                    }
                }
            } else if (input.equals("exit")) {
                System.out.println("Bye!");
                return;
            } else {
                System.out.printf("There is no '%s' operation", input);
                String text = """
                        
                        
                        Please input operation (encode/decode/exit):""";
                System.out.println(text);
            }
        }
    }
}
