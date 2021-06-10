package com.company;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private boolean check = false;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = b*b - 4*a*c;
        if (delta > 0) {
            System.out.print(" phương trình có 2 nghiệm phân biệt: " + getRoot1() + ", " + getRoot2());
            return delta;
        } else if (delta == 0) {
            System.out.print("phương trình có 1 nghiệm: " + getRoot2());
            return delta;
        } else {
            System.out.print("phương trình vô nghiệm");
            return delta;
        }
    }
    public double  getRoot1(){
        double root1 = (-b - Math.pow(b*b - 4*a*c,0.5));
        return root1;
    }
    public double  getRoot2() {
        double root2 = (-b + Math.pow(b*b - 4*a*c,0.5));
        return root2;
    }
}
