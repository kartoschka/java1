package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Put exercise number:");
        switch(new Scanner(System.in).nextInt()) {
            case 1:
                ex_numberIsPosNeg();
                break;
            case 2:
                ex_weekdays();
                break;
            case 3:
                ex_maxnumber();
                break;
            case 4:
                ex_numberIsEvenOdd();
                break;
            default:
                System.out.println("invalid exercise number");
        }
    }

    private static void ex_numberIsEvenOdd() {
        System.out.println("Put a number:");
        if(new Scanner(System.in).nextInt() % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    private static void ex_maxnumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number:");
        int num1 = sc.nextInt();
        System.out.println("Put another number:");
        int num2 = sc.nextInt();
        System.out.println(Math.max(num1, num2) + " " + "is bigger");
    }

    private static void ex_weekdays() {
        System.out.println("Put weekday number:");
        String day;
        switch(new Scanner(System.in).nextInt()) {
            case 1:
                day = "Lundi"; break;
            case 2:
                day = "Mardi"; break;
            case 3:
                day = "Mercredi"; break;
            case 4:
                day = "Jeudi"; break;
            case 5:
                day = "Vendredi"; break;
            case 6:
                day = "Samedi"; break;
            case 7:
                day = "Dimanche"; break;
            default:
                day = "invalid input";
        }
        System.out.println(day);
    }

    private static void ex_numberIsPosNeg() {
        System.out.println("Enter a number: ");
        double num = getNumber();
        String extraInfo;

        if(Math.abs(num) > 1_000_000) {
            extraInfo = "large";
        } else if(Math.abs(num) < 1) {
            extraInfo = "small";
        } else {
            extraInfo = "regular";
        }

        if(num > 0) {
            System.out.println(extraInfo + " " + "positive number");
        } else if (num < 0) {
            System.out.println(extraInfo + " " + "negative number");
        } else { System.out.println("zero"); }
    }

    private static double getNumber() {
        return new Scanner(System.in).nextDouble();
    }
}
