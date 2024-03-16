import java.util.Random;

public class hwA8 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        int[] arraySum = new int[5];
        boolean sorted = false;

        for (int i = 0; i < array.length; i++) {
            int columnSum = 0;

            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
                columnSum += array[i][j];
            }
            System.out.println();
            arraySum[i] = columnSum;
        }

        while (!sorted){
            sorted = true;

            for (int i = 0; i < arraySum.length - 1; i++) {
                int replacement;

                if (arraySum[i] < arraySum[i + 1]) {
                    replacement = arraySum[i];
                    arraySum[i] = arraySum[i + 1];
                    arraySum[i + 1] = replacement;
                    sorted = false;
                }
            }
        }
        System.out.println("наибольшее " + arraySum[0]);
    }
}