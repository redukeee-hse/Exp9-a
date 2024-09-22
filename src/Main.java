import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Git!!!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        System.out.println("Второе число не должно быть равно 0 !!!");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("Частное равно" + (num1 / num2));
    }
}
