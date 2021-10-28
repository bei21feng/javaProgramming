public class LearnMatrix {
    public static void learnMatrix() {
        int[][] triangleArr1 = {
                {5, 6},
                {7, 8, 9}
        };

        int[][] triangleArr = new int[2][];
        triangleArr[0] = new int[2];
        triangleArr[1] = new int[1];

        triangleArr[0][0] = 1;
        triangleArr[0][1] = 2;
        triangleArr[1][0] = 3;

        printArr(triangleArr);
        System.out.println();
        printArr(triangleArr1);
    }

    public static void printArr(int[][] irregularArr) {
        for (int i = 0; i < irregularArr.length; i++) {
            for (int j = 0; j < irregularArr[i].length; j++) {
                System.out.printf("%-3d", irregularArr[i][j]);
            }
            System.out.println();
        }
    }
}
