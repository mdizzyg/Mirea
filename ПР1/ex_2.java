import java.util.Scanner;

public class ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Ввод элементов массива
        System.out.println("Введите " + size + " целых чисел:");

        // Используем цикл do while для ввода элементов массива
        int i = 0;
        do {
            numbers[i] = scanner.nextInt();
            i++;
        } while (i < size);

        // Считаем сумму, максимальный и минимальный элементы
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // Используем цикл while для подсчета суммы и поиска макс/мин
        int j = 0;
        while (j < size) {
            sum += numbers[j];

            if (numbers[j] > max) {
                max = numbers[j];
            }
            if (numbers[j] < min) {
                min = numbers[j];
            }
            j++;
        }

        // Вывод результатов
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}