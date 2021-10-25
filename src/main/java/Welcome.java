import java.util.Scanner;
public class Welcome {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/1000;

        //long currentYears = totalSeconds/(60 * 60 * 24 * )
        long currentSeconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 60;

        System.out.println("Now the time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds + "GMT");
        int a = 6;
        int b = a++;

        System.out.println(a);
        System.out.println(b);

        a = 6;
        b = ++a;

        System.out.println(a);
        System.out.println(b);

        double num = 4.6783;
        System.out.println((int)(num * 100) / 100.0);
        System.out.println((int)(num * 100 + 0.5) / 100.0);

        float f = 12.5f;
        int i = (int)f;
        System.out.println("f is " + f);
        System.out.println("i is " + i);

        double amount = 5;
        System.out.println(amount / 2);

        System.out.println(1.0 - 0.9);

        //Scanner input = new Scanner(System.in);
//        System.out.print("please enter an integer: ");
//        int v1 = input.nextInt();
//        System.out.print("please enter a double value: ");
//        double v2 = input.nextDouble();
//
//        System.out.println("v1 : " + v1 + "v2 : " + v2);

//        int sum = 0;
//        System.out.print("Please enter an integer: ");
//        int myNum = input.nextInt();
//        while (myNum >= 1){
//            sum += myNum % 10;
//            myNum /= 10;
//        }
//
//        System.out.println(sum);

        double x = Math.rint(5.5);
        System.out.println(x);

    }
}
