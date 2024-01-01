public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы 2");
        int[] arr = generateRandomArray();
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        //int sum = 0;
    }
    public static void task1() {
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int b1 : arr) {
            sum += b1;
        }
        System.out.println("Сумма трат за месяц: " + sum);
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int a1 : arr) {
            if (a1 < min) {
                min = a1;
            } else if (a1 > max) {
                max = a1;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + min);
        System.out.println("Максимальная сумма трат за день составила: " + max);
    }
    public static void task3() {
        int[] numarr = generateRandomArray();
        int sum = 0;
        for (int i: numarr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила: " + sum/(float) numarr.length);
    }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
