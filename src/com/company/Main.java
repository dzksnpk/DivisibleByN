package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type a,b,n. Output will be count of how many numbers are divisible by n from range " +
                "a to b (when a < b):");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        int count = 0;

        for (int i = b; i >= a; i--) {
            if (i % n == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
