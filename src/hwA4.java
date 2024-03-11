public class hwA4 {
    public static void main(String[] args) {
        int[] array = {-1, -2, -10, 7, 13, -10, 7, 12};
        boolean sorted = false;
        int replacement;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {


                if (array[i] < array[i + 1]) {
                    replacement = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = replacement;
                    sorted = false;


                }
            }
        }
        System.out.println("наибольшее " + array[0]);
    }
}