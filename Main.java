import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Задание 1: Работа с числами
        System.out.println("=== Задание 1 ===");
        System.out.print("Введите два целых числа (через пробел): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Математические операции
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        if (b != 0) {
            System.out.println("Деление: " + ((double)a / b));
        } else {
            System.out.println("Деление: на ноль делить нельзя");
        }
        
        scanner.nextLine(); // очистка буфера
        
        // Задание 2: Сравнение строк
        System.out.println("\n=== Задание 2 ===");
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        // Задание 3: Четные числа в массиве
        System.out.println("\n=== Задание 3 ===");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Четные числа в массиве: ");
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        
        scanner.close();
    }
}
