package lab1.lab1_1;




public class zad1 {

    // 9). Найти максимальный среди минимальных элементов столбцов двухмерного
    // массива
    // целых чисел. Определить номер строки и столбца для такого элемента.
    public static void zadanie1(int array[][]) {
        int max_global = -1000;
        int min_column = 1000;
        int j, i;
        int size1 = array[0].length; // количество столбцов columns
        int size2 = array.length; // количество строк rows
        int index_min_column = 0;
        int index_min_row = 0;
        int index_max_column = 0;
        int index_max_row = 0;
        System.out.printf("Длина строк: %d\n", size1);
        System.out.printf("Высота столбцов: %d\n", size2);
        // здесь

        for (j = 0; j < size1; j++) {
            for (i = 0; i < size2; i++) {
                System.out.printf("Проверяю %d-тый элемент %d-ого столбца: %d\n", i, j, array[i][j]);
                if (array[i][j] < min_column) { // Поиск наименьшего элемента в столбце
                    min_column = array[i][j];
                    if (i == size2 && j == size1) { // если счетчик вышел за границы
                        index_min_column = i - 1;
                        index_min_row = j - 1;
                    } else {
                        index_min_column = i;
                        index_min_row = j;
                    }
                }
            }
            System.out.printf("\n Координаты минимума: [%d] [%d]", index_min_column, index_min_row);
            System.out.printf("\n Минимум: %d \n", min_column);

            if (min_column > max_global) { // Поиск наибольшего среди наименьших столбцов таблицы
                max_global = min_column;
                index_max_column = index_min_column;
                index_max_row = index_min_row;
            }

            min_column = 1000;
            System.out.printf("\n Координаты максимума: [%d] [%d]", index_max_column, index_max_row);
            System.out.printf("Максимум: %d \n \n", max_global);
        }

        // System.out.printf("min: %d \n", min_column);
        System.out.printf(" В итоге: \n max: %d \n", max_global);
        System.out.printf("Строка: %d \n", index_max_column);
        System.out.printf("Столбец: %d \n",index_max_row);
    }

    public static int[][] rand_array(int rows, int columns) {
        int[][] b = new int[rows][columns]; // двумерный массив
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = (int) (Math.random() * 201 - 100);
                System.out.printf("[%d][%d]=%d ", i, j, b[i][j]);
            }
            System.out.println("\n");
        }
        return b;
    }

    public static void print_array(int[][] a) {
        String stroka = "Печатаю матрицу...";
        System.out.printf("%s \n", stroka);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf(" %d ", a[i][j]);
            }
            System.out.printf("\n");
        }
    }

}
