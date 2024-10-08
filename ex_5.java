import java.util.Scanner;
public class ex_5 {
    // Метод для вычисления факториала
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для вычисления факториала: ");
        int number = scanner.nextInt();

        // Проверка на отрицательные числа
        if (number < 0) {
            System.out.println("Факториал отрицательного числа не определен.");
        } else {
            long fact = factorial(number);
            System.out.println("Факториал числа " + number + " равен " + fact);
        }

        scanner.close();
    }


}
