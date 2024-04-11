public class hwA3 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -10, 7, 12, -10, 7, 12};
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("сумма четных элементов %d", sum);
    }
}