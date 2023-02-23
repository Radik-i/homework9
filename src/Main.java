import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Задача 2");
        int max = arr[0];
        int min = arr[0];
        /* цикл для визуальной проверки самого массива, в задаче этого не требуется
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }   */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            else if (arr[i] < min) min = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();

        System.out.println("Задача 3");
        double averageAmount = (double)sum/arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f руб", averageAmount);
        System.out.println();

        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i=reverseFullName.length-1; i>=0; i--) {
         System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}