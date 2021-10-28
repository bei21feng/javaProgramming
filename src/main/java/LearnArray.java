import java.util.Arrays;

public class LearnArray {
    public static void learnArray(){
        String[] fruits = {"apple", "banana", "pear"};

        // foreach
        for (String fruit:
             fruits) {
            System.out.printf("%8s\n", fruit);
        }

        int[] numArr1 = {1, 2, 3, 4};
        int[] numArr2 = {1, 2, 3, 4, 5};
        int index1 = binarySearch(numArr1, 2);
        int index2 = binarySearch(numArr2, 5);
        System.out.println(index1 + "---" + index2);

        int[] intArr = {1, 4, 5, 8, 9};
        selectionSort(intArr);
        System.out.println(Arrays.toString(intArr));
    }

    public static int binarySearch(int[] intArr, int key){
        int low = 0;
        int high = intArr.length - 1;
        while(low <= high){
            int middle = (low + high)/2;
            if (key == intArr[middle]){
                return middle;
            }
            else if (key < intArr[middle]){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
        return - (low + 1);
    }

    public static void selectionSort (int[] list){
        for (int item = 0; item < list.length; item++) {
            int currentMin = list[item];
            int finalMinIndex = item;
            for (int j = item + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    finalMinIndex = j;
                }
            }
            list[finalMinIndex] = list[item];
            list[item] = currentMin;
        }
    }
}
