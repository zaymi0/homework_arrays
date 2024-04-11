public class hwA5 {
    public static void main(String[] args) {
        int[] array = {39, 39, 39, 47, 39, 47, 47, 87};
        int[] arrayToSort = new int[array.length];
        int numberEmptyArrayIndexes = 0;

        for (int i = 0; i < array.length; i++) {
            int singleNumbers = 0;

            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j] && i != j) {
                    singleNumbers++;
                }
                if (array[i] > arrayToSort[singleNumbers] && singleNumbers != 0) {
                    arrayToSort[singleNumbers] = array[i];
                }
            }
        }
        for (int i = arrayToSort.length - 1; i > 0; i--) {

            if (arrayToSort[i] != 0){
                System.out.print(arrayToSort[i]);
                break;
            } else {
               numberEmptyArrayIndexes++;
            }
        }
        if (numberEmptyArrayIndexes == arrayToSort.length - 1) {
            System.out.println("повторяющихся нет");
        }
    }
}