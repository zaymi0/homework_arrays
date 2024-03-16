import java.util.Random;

public class hwA6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
    }
}