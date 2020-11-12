package com.company;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Bintang {
    public static void main(String[] args) {
        int a, b = 0, i, j, k;
        boolean status = true;
        Scanner write = new Scanner(System.in);

        System.out.println("=====TRAIN 4 TRIANGLE TYPE====");

        while (status) {
            try {
                System.out.print("Input the height of the triangle: ");
                b = write.nextInt();
                status = false;
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number!");
                status = true;
                System.exit(0);
            }
        }
        System.out.print("Input type of triangle 1,2,3 or 4: ");
        a = write.nextInt();
        if (a == 1) {
            //normal align left triangle
            for (i = 1; i <= b; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (a == 2) {
            //left-aligned triangle
            for (i = 1; i <= b; i++) {
                for (j = b; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (a == 3) {
            //right align triangle
            for (i = 1; i <=b; i++) {
                for (j = b; j > i; j--) {
                    System.out.print(" ");
                }
                for (int x = 1; x <= i; x++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (a == 4) {
            //right-aligned triagle
            for (i = 1; i <=b ; i++) {
                for (j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (k = b; k >= i; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Wrong Type Input");
        }

    }
}