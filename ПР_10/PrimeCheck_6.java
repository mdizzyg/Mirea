package ПР_10;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n (>1): ");
        int n = scanner.nextInt();

        if (isPrime(n, 2)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

    // Рекурсивный метод для проверки простоты числа
    public static boolean isPrime(int n, int divisor) {
        if (n <= 2) {
            return n == 2; // 2 - простое число
        }
        if (n % divisor == 0) {
            return false; // Если делится без остатка, число составное
        }
        if (divisor * divisor > n) {
            return true; // Если делитель превысил корень числа, оно простое
        }
        return isPrime(n, divisor + 1); // Проверяем следующий делитель
    }
}

