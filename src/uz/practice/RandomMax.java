package uz.practice;

import java.util.Scanner;

import static java.lang.Math.random;

public class RandomMax {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n=3;

        double [] array= new double[n];
        for (int i=0; i<3; i++) {
            array[i]= Math.random();
        }
        System.out.println("10 ta massiv element");
        for (int j=0; j< array.length; j++) {
            System.out.print(array[j] + " ");

        }
    }
}
