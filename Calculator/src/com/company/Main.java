package com.company;

public class Main {
    public static void main(String[] args) {
        try {
            double x = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double y = Double.parseDouble(args[2]);
            double ans = calc(x, y, operation);
            System.out.println("result:" + ans);
        } catch (Exception ex) {
            System.out.println("Ошибка!");
        }
    }

    public static double calc(double x, double y, char operation) {
        if (operation == '+') {
            return x + y;
        }
        if (operation == '*') {
            return x * y;

        }
        if (operation == '-') {
            return x - y;
        }
        if (operation == '/' && y != 0) {
            return x / y;
        }
        return Double.NaN;
    }
}
