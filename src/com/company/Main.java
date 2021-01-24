package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(32);
    }
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        int factor = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                factor ++;
                sum +=i;

                System.out.println(i);
            }
        }

    }
}
