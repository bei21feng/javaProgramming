import java.util.Scanner;

public class LearnString {
    public static void stringProg(){
        // get the length of a string
        String message = "Welcome to Java";
        System.out.println(message.length());

        // charAt
        System.out.println(message.charAt(0));

        // concat
        String welcomeMsg = message.concat(" my friend!");
        System.out.println(welcomeMsg);
        System.out.println(message + " my friend!");
        // message += " my friend!";

        char chr = 'a';
        String str = "a";
        char chr1 = (char)(chr + 1);
        System.out.println(chr + 1);
        System.out.println(chr1);
        System.out.println(str + 1);

        Scanner input = new Scanner(System.in);
        //System.out.print("please enter a string:");
        //String s1 = input.next();
        //String s2 = input.nextLine();
        //System.out.println(s1);
        //System.out.println(s2);

        // compare two strings
        String str1 = "abcd";
        String str2 = "aecf";
        System.out.println(str1.compareTo(str2));

        // output two cities in alphabetical order
//        System.out.print("please enter two cities: ");
//        String city1 = input.nextLine();
//        System.out.print("enter another city name: ");
//        String city2 = input.nextLine();
//        System.out.println(city1.compareTo(city2)<0 ? city1 : city2);

        System.out.println(message.indexOf("Ja"));
        System.out.println(message.lastIndexOf('a'));

        // get last and first name
//        System.out.print("please enter your full name: ");
//        String fullName = input.nextLine();
//        String firstName = fullName.substring(0, fullName.indexOf(' '));
//        String lastName = fullName.substring(fullName.indexOf(' ')+1);
//        System.out.println("your first name: " + firstName);
//        System.out.println("your last name: " + lastName);

        int intValue = Integer.parseInt("123");
        System.out.println(((Object)intValue).getClass().getName());

        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);

        System.out.println(1 + "Welcome" + ('\u0001' + 1));
        System.out.println(1 + "welcome" + 'a' + 1);
        System.out.println("\u048a");

        int myNum = 34567;
        System.out.println((myNum + "").length());

        System.out.printf("%5.2f\n", 51.6653);
        System.out.printf("%08d\n", 1234);
        System.out.printf("%5.4e\n", 32.45);
    }
}
