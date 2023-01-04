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
                if (i == 0 && (Integer.toBinaryString(number).charAt(0) - 48) == 1) {
                    System.out.print(0 + " " + 0);
                } else if (i == 0 && (Integer.toBinaryString(number).charAt(0) - 48) == 0) {
                    System.out.print(0 + "0 " + 0);
                }
                if ((i != 0 && (Integer.toBinaryString(input.charAt(i)).charAt(0) - 48) == 1)) {
                    if ((Integer.toBinaryString(input.charAt(i - 1)).charAt(Integer.toBinaryString(number).length() - 1) - 48) != 1) {
                        System.out.print(" " + 0 + " " + 0);
                    } else {
                        System.out.print(0);
                    }
                } else if (i != 0 && (Integer.toBinaryString(input.charAt(i)).charAt(0) - 48) == 0) {
                    if ((Integer.toBinaryString(input.charAt(i - 1)).charAt(Integer.toBinaryString(number).length() - 1) - 48) != 0) {
                        System.out.print(" " + 0 + "0 " + 0);
                    } else {
                        System.out.print(0);
                    }
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
                    } else if (integer_variable == 0) {
                        if ((Integer.toBinaryString(number).charAt(j - 1) - 48) != 0) {
                            System.out.print(" " + 0 + "0 " + 0);
                        } else {
                            System.out.print(0);
                        }
                    }
                }
            } else {
                for (int j = size; j < 7; j++) {
                    System.out.println(input.charAt(i) + " = " + "0" + Integer.toBinaryString(number));
                    String variableNew = "0" + Integer.toBinaryString(number);
                    if (i == 0 && (variableNew.charAt(0) - 48) == 1) {
                        System.out.print(0 + " " + 0);
                    } else if (i == 0 && (variableNew.charAt(0) - 48) == 0) {
                        System.out.print(0 + "0 " + 0);
                    }
                    int i1 = ("0" + Integer.toBinaryString(input.charAt(i - 1))).charAt(variableNew.length() - 1) - 48;
                    if ((i != 0 && (variableNew.charAt(0) - 48) == 1)) {
                        if (i1 != 1) {
                            System.out.print(" " + 0 + " " + 0);
                        } else {
                            System.out.print(0);
                        }
                    } else if (i != 0 && variableNew.charAt(0) - 48 == 0) {
                        if (i1 != 0) {
                            System.out.print(" " + 0 + "0 " + 0);
                        } else {
                            System.out.print(0);
                        }
                    }
                    for (int k = 1; k < variableNew.length(); k++) {
                        char variable = variableNew.charAt(k);
                        int integer_variable = variable - 48;
                        int i2 = variableNew.charAt(j - 1) - 48;
                        if (integer_variable == 1) {
                            if (i2 != 1) {
                                System.out.print(" " + 0 + " " + 0);
                            } else {
                                System.out.print(0);
                            }
                        } else if (integer_variable == 0) {
                            if (i2 != 0) {
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