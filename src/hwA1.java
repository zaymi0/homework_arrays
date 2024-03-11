public class hwA1 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -10, 7, 12};
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i : array) {

            if (i > 0) {
                positiveNumbers++;

            } else {
                negativeNumbers++;
            }
        }
        System.out.printf("количество отрицательных : %d",negativeNumbers);
        System.out.printf("\n количество положительных: %d",positiveNumbers);
    }
}