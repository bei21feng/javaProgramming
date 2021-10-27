import java.util.Scanner;

public class LearnChar {
    public static void charProg(){
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        char x = 'a';
        char y = 'b';
        System.out.println(++x);
        System.out.println(y++);
        System.out.println(x - y);

        // char -> int
        //int ascii = (int)x;
        int ascii = x;
        System.out.println(ascii);

        // int -> char
        int ascNum = 90;
        char ascChr = (char)ascNum;
        System.out.println(ascChr);

        // float -> int
        float f = 1000.34f;
        int i = (int)f;
        System.out.println(i);

        // '1' to 49 & 1
        char iOrg = '1';
        int iAsc = iOrg;
        int iNum = Character.getNumericValue(iOrg);
        int iNum2 = Integer.parseInt(String.valueOf(iOrg));
        System.out.println(iAsc);
        System.out.println(iNum);
        System.out.println(iNum2);


        // output Greek alphabet
        System.out.println("\u03B1 \u03b2");

        //System.out.println('\\');
        System.out.println('a' > 'b');
        System.out.println('a' < 'b');


        System.out.println('1'+'1');

        // convert char to int x3
        char ch = '4';
        if(Character.isDigit(ch)){
            int value1 = Character.getNumericValue(ch);
            System.out.println(value1);
        }

        String str = ch + "";
        int value2 = Integer.parseInt(str);
        System.out.println(value2);

        int value4 = Integer.parseInt(String.valueOf(ch)); // String.valueOf convert char to string
        System.out.println(value4);

        int value3 = ch - '0';
        System.out.println(value3);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int decNum = input.nextInt();
        if (decNum >= 0 && decNum <= 127){
            System.out.println((char)decNum);
        }
        else{
            System.out.println("invalid number");
            System.exit(1);
        }
    }
}
