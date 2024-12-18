package ПР_10;

import java.util.Scanner;

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
