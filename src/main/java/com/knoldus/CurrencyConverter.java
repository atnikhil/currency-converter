package com.knoldus;

import java.util.*;

    class CurrencyConverter {
        private CurrencyConverter() {
        Scanner sc = new Scanner(System.in);
        int usd, inr, yen, pounds, euro;
        System.out.println("Welcome to CurrencyConverter");
        System.out.println("enter 1 for USD :");
        System.out.println("enter 2 for INR :");
        System.out.println("enter 3 for YEN :");
        System.out.println("enter 4 for POUNDS :");
        System.out.println("enter 5 for EURO :");
        System.out.println("Choose the currency which you want to convert :");
        int choiceIn = sc.nextInt();

        System.out.println("Choose the currency to which you want to convert :");
        int choiceOut = sc.nextInt();
        System.out.println("Enter the amouunt");
        double amount = sc.nextDouble();

        if (choiceIn == 1 && choiceOut == 2 || choiceIn == 2 && choiceOut == 1) {
            if (choiceIn == 1) {
                amount = amount * 68.77;
            }
            if (choiceIn == 2) {
                amount = amount / 68.77;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 1 && choiceOut == 3 || choiceIn == 3 && choiceOut == 1) {
            if (choiceIn == 1) {
                amount = amount * 99.35419771;
            }
            if (choiceIn == 3) {
                amount = amount / 99.35419771;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 1 && choiceOut == 4 || choiceIn == 4 && choiceOut == 1) {
            if (choiceIn == 1) {
                amount = amount * 0.85;
            }
            if (choiceIn == 4) {
                amount = amount / 0.85;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 1 && choiceOut == 5|| choiceIn == 5 && choiceOut == 1) {
            if (choiceIn == 1) {
                amount = amount / 1.18;
            }
            if (choiceIn == 5) {
                amount = amount * 1.18;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 2 && choiceOut == 3 || choiceIn == 3 && choiceOut == 2) {
            if (choiceIn == 2) {
                amount = amount * 1.61;
            }
            if (choiceIn == 3) {
                amount = amount / 1.61;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 2 && choiceOut == 4 || choiceIn == 4 && choiceOut == 2) {
            if (choiceIn == 2) {
                amount = amount / 91.34;
            }
            if (choiceIn == 4) {
                amount = amount * 91.34;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 2 && choiceOut == 5 || choiceIn == 5 && choiceOut == 25) {
            if (choiceIn == 2) {
                amount = amount / 80.83;
            }
            if (choiceIn == 5) {
                amount = amount * 1.5541;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 3 && choiceOut == 4 || choiceIn == 4 && choiceOut == 3) {
            if (choiceIn == 3) {
                amount = amount / 146.77;
            }
            if (choiceIn == 4) {
                amount = amount * 146.77;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 3 && choiceOut == 5 || choiceIn == 5 && choiceOut == 3) {
            if (choiceIn == 3) {
                amount = amount / 129.86;
            }
            if (choiceIn == 5) {
                amount = amount * 129.86;
            }
            System.out.println("the converted amount :"+amount);
        }
        if (choiceIn == 4 && choiceOut == 5 || choiceIn == 5 && choiceOut == 4) {
            if (choiceIn == 4) {
                amount = amount * 1.13;
            }
            if (choiceIn == 5) {
                amount = amount / 1.13;
            }
            System.out.println("the converted amount :"+amount);
        }
    }
    public static void main(String...S)
    {
        new CurrencyConverter();
    }
}