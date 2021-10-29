package indi.bill.javaprogramming.learnbasic;

public class StackOfIntegers {
    // data field
    public static final int MAX_NUMBER_OF_STACK = 5;
    private int pointer = -1;
    private int[] stackArr = new int[MAX_NUMBER_OF_STACK];

    // constructors
    public StackOfIntegers () {}

    public StackOfIntegers (int num) {
        pointer++;
        stackArr[pointer] = num;
    }

    public StackOfIntegers (int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            //pointer++;
            stackArr[++pointer] = numArr[i];
        }
    }

    // methods
    public void showStack () {
        for (int i = 0; i < pointer + 1; i++) {
            System.out.printf("%-4d", stackArr[i]);
        }
        System.out.println();
    }

    public void push (int num) {
        // double the size when the array is full
        if (pointer >= MAX_NUMBER_OF_STACK - 1) {
            int[] tempArr = new int[(pointer + 1) * 2];
            System.arraycopy(stackArr, 0, tempArr, 0, stackArr.length);
            // pass the array
            stackArr = tempArr;
        }

        stackArr[++pointer] = num;

    }

    public int pop () {
        if (pointer == -1) {
            System.out.println("the stack is empty!");
            return -1;
        }
        else {
//            int popNum = stackArr[pointer];
//            pointer--;
//            return popNum;
            return stackArr[pointer--];
        }
    }


}
