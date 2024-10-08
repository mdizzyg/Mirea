import java.text.DecimalFormat;
public class ex_4 {
        public static void main(String[] args) {
            // Создаем объект DecimalFormat для форматирования вывода
            DecimalFormat df = new DecimalFormat("#.####");

            System.out.println("Первые 10 чисел гармонического ряда:");
            for (int n = 1; n <= 10; n++) {
                double harmonicNumber = harmonic(n);
                System.out.println("H(" + n + ") = " + df.format(harmonicNumber));
            }
        }

        // Метод для вычисления n-го гармонического числа
        public static double harmonic(int n) {
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }
            return sum;
        }
}
