package lab1.lab1_1;
import java.util.Scanner;

public class lab1_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int rows = 0, columns = 0;

        System.out.printf("Введите количество строк: ");
        rows = sc.nextInt();
        System.out.println("Введите количество столбцов: ");
        columns = sc.nextInt();

        int[][] Array = zad1.rand_array(rows, columns);

        zad1.print_array(Array);

        zad1.zadanie1(Array);

        sc.close();
    }
}
