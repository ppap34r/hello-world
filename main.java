public class ArraySorter {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        sortNstuff(numbers);
        System.out.println("Sorted??: ");
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }

    public static void sortNstuff(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    int temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
    }
}
