//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.PrintStream;
import java.util.Scanner;

public class LearnLoop {
    public static void learnLoop() {
//        try(PrintStream ps = new PrintStream(new FileOutputStream("output.txt"))){
//            System.setOut(ps);
//            System.out.println("hello world");
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum += i;
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 0; i < 10; i++) {
            sum2 += i;
        }
        System.out.println(sum2);

        // 判断回文
//        Scanner input = new Scanner(System.in);
//        System.out.print("please enter a string: ");
//        String testStr = input.nextLine();
//        for (int i = 0; i < (testStr.length() / 2); i++) {
//            if(testStr.charAt(i) != testStr.charAt(testStr.length() - i -1)){
//                System.out.println("不是回文");
//                break;
//            }
//        }
//        System.out.println("是回文");

        // prime number
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        boolean isPrimes = false;
        int counter = 0;
        int number;

        for (number = 2; counter < NUMBER_OF_PRIMES; number++) {
            isPrimes = true;
            for (int i = 2; i <(number/2 + 1); i++) {
                if ((number % i) == 0) {
                    isPrimes = false;
                }
            }

            if (isPrimes) {
                counter++;
                System.out.printf("%-6d", number);
                if ((counter % NUMBER_OF_PRIMES_PER_LINE) == 0) {
                    System.out.println();
                }
            }
        }


    }
}
