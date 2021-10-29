package indi.bill.javaprogramming.learnbasic;// convert hex to dec digit
import java.util.Scanner;

public class HexDigit2Dec {
    public static void hexDigit2Dec(){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter a hex digit: ");
        String inputNum = input.next();

        if (inputNum.length() != 1){
            System.out.println("you must enter exact one number");
            System.exit(1);
        }

        char ch = Character.toUpperCase(inputNum.charAt(0));
        if (ch >= 'A' && ch <= 'F'){
            int value = ch - 'A';
            System.out.println(value + 10);
        }

        else if(ch >= '0' && ch <= '9'){
            System.out.println(ch - '0');
        }

        else{
            System.out.println("invalid input");
            System.exit(1);
        }
    }
}
