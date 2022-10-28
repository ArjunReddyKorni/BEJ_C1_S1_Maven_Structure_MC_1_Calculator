package challenge.niit;


import challenge.niit.calculator.Calculator;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers");







        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("Sum of Number is "+calculator.addition(number1, number2));
        System.out.println("Division of Number is "+calculator.division(number1, (int)number2));
        System.out.println("Subtraction of Number is "+calculator.subtraction(number1, number2));
        System.out.println("product of Number is "+calculator.multiplication(number1, number2));
        System.out.println("Modulo of Number is "+calculator.modulo(number1, number2));
    }
}
