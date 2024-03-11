public class hwA2 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -10, 7, 12, -10, 7, 12};
        int sum = 0;

        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];

        }
        System.out.printf("сумма элементов с четными индексами %d", sum);

    }
}