package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a: ");
        a = scanner.nextDouble();
        System.out.print("enter b: ");
        b = scanner.nextDouble();
        System.out.print("enter c: ");
        c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0){
                    System.out.println("phương trình vô số nghiệm");
                    return;
                } else {
                    System.out.println("phương trình vô nghiệm");
                    return;
                }
            } else {
                double x;
                x = (-c/b);
                System.out.println("phương trình có nghiệm: " + x);
                return;
            }
        } else {
            QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
            quadraticEquation.getDiscriminant();
        }
    }
}
