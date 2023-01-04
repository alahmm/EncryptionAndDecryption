package chucknorris;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.*;
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
/*                String inputNew = input.charAt(i) + " = " + Integer.toBinaryString(number);
                System.out.println(inputNew);*/
                if ((Integer.toBinaryString(number).charAt(0) - 48) == 1) {
                    System.out.print(0 + " " + 0);
                } else {
                    System.out.print(0 + "0 " + 0);
                }


                for (int j = 1; j < Integer.toBinaryString(number).length(); j++) {
                    char variable = Integer.toBinaryString(number).charAt(j);
                    int integer_variable = variable - 48;
                    if (integer_variable == 1) {
                        if ((Integer.toBinaryString(number).charAt(j - 1) - 48) != 1) {
                            System.out.print(" " + 0 + " " + 0);
                        } else {
                            System.out.print(0);
                        }
                    } else if ((Integer.toBinaryString(number).charAt(j) - 48) == 0) {
                        if ((Integer.toBinaryString(number).charAt(j - 1) - 48) != 0) {
                            System.out.print(" " + 0 + "0 " + 0);
                        } else {
                            System.out.print(0);
                        }
                    }
                }
            } else {
                for (int j = size; j < 7; j++) {
/*                    String inputNew = input.charAt(i) + " = " + "0" + Integer.toBinaryString(number);
                    System.out.println(inputNew);*/
                    String test = "0" + Integer.toBinaryString(number);
                    if ((test.charAt(0) - 48) == 1) {
                        System.out.print(0 + " " + 0);
                    } else {
                        System.out.print(0 + "0 " + 0);
                    }
                    for (int k = 1; k < test.length(); k++) {
                        char variable = test.charAt(k);
                        int integer_variable = variable - 48;
                        if (integer_variable == 1) {
                            if ((test.charAt(k - 1) - 48) != 1) {
                                System.out.print(" " + 0 + " " + 0);
                            } else {
                                System.out.print(0);
                            }
                        } else if ((test.charAt(k) - 48) == 0) {
                            if ((test.charAt(k - 1) - 48) != 0) {
                                System.out.print(" " + 0 + "0 " + 0);
                            } else {
                                System.out.print(0);
                            }
                        }
                    }

                }

            }
        }
    }
}