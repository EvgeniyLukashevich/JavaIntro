package homework.seminar05_hw;

import java.util.Scanner;

public class Program {
    public static int triangle(int num) {
        if (num == 1) {
            return 1;
        } else {
            return (num + triangle(num - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scan.nextInt();
        System.out.printf("%d-е треугольное число = %d", num, triangle(num));
    }
}
