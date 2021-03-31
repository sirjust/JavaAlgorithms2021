package com.company;

public class FactorialCalculator {
    public static int factorialIterative(int number){
        if (number == 0) return 1;

        int factorial = 1;
        for (int i=1; i <= number; i++){
            factorial *= i;
        }

        return factorial;
    }

    // n! = n * (n-1)!
    public static int factorialRecursive(int number){
        if(number == 0) return 1;

        return number * factorialRecursive(number -1);
    }
}
