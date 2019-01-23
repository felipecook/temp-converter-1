package edu.cnm.deepdive;

import java.util.Scanner;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean repeat;

    do {
      double fahrenheit;
      double celsius;
      System.out.print("Enter a temperature in Fahrenheit: ");
      fahrenheit = input.nextDouble();
      celsius = (fahrenheit - 32) * 5 / 9;
      System.out.println(celsius);
      System.out.print("Would you like to calculate again? true or false");
      repeat = input.nextBoolean();
    } while (repeat);
  }
}
