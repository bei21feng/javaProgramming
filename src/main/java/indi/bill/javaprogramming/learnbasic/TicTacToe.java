package indi.bill.javaprogramming.learnbasic;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    // 0:empty  1:x  2:o
    static char[][] checkerBoard = new char[3][3];
    public static void ticTacToe() {
        // initialize checkerBoard
        for (int i = 0; i < checkerBoard.length ; i++) {
            Arrays.fill(checkerBoard[i], ' ');
        }

        // welcome the user
        welcome();

        //boolean endOfGame = false;

        while (true){
            // user plays
            userPlay();
            printCheckerBoard();
            if (checkerBoardIsFull() || someOneWins()){
                System.exit(0);
            }

            // computer plays
            computerPlay();
            printCheckerBoard();
            if (checkerBoardIsFull() || someOneWins()){
                System.exit(0);
            }
        }

    }
    public static void welcome() {
        System.out.println("indi.bill.javaprogramming.learnbasic.Welcome to game Tic-Tac-Toe");
        System.out.println("your piece is x");
        System.out.println("location you should enter for example:");
        System.out.println("2 3");
    }

    public static void printCheckerBoard() {
        System.out.printf("  %3d%4d%4d\n", 1, 2, 3);
        System.out.println("--------------");

        System.out.printf("1 | %c | %c | %c |\n", checkerBoard[0][0], checkerBoard[0][1], checkerBoard[0][2]);
        System.out.println("--------------");
        System.out.printf("2 | %c | %c | %c |\n", checkerBoard[1][0], checkerBoard[1][1], checkerBoard[1][2]);
        System.out.println("--------------");
        System.out.printf("3 | %c | %c | %c |\n", checkerBoard[2][0], checkerBoard[2][1], checkerBoard[2][2]);
        System.out.println("--------------");
    }

    public static void userPlay() {
        Scanner input = new Scanner(System.in);
        // user enter the location
        System.out.print("please enter the location: ");
        String[] location = input.nextLine().trim().split("\\s+");

        int locationX = Integer.parseInt(location[0]) - 1;
        int locationY = Integer.parseInt(location[1]) - 1;

        // set x
        checkerBoard[locationX][locationY] = 'x';
        System.out.println("Your turns: ");
    }

    public static void computerPlay() {
        // create a random location
        // do not conflict with the existing ones
        int locationX = (int)(Math.ceil(Math.random()*3)) - 1;
        int locationY = (int)(Math.ceil(Math.random()*3)) - 1;
        while (checkerBoard[locationX][locationY] != ' ') {
            locationX = (int)(Math.ceil(Math.random()*3)) - 1;
            locationY = (int)(Math.ceil(Math.random()*3)) - 1;
        }
        checkerBoard[locationX][locationY] = 'o';
        System.out.println("Computer's turns: ");
    }

    public static boolean someOneWins () {
        boolean someOneWins = false;


        // check the user wins
        // condition1
        for (int i = 0; i < 3; i++) {
            if(checkerBoard[i][0] == 'x' && checkerBoard[i][1] == 'x' && checkerBoard[i][2] == 'x'){
                someOneWins = true;
                System.out.println("Congrats! You win!");
                return someOneWins;
            }
        }

        // condition2
        for (int i2 = 0; i2 < 3; i2++) {
            if(checkerBoard[0][i2] == 'x' && checkerBoard[1][i2] == 'x' && checkerBoard[2][i2] == 'x'){
                someOneWins = true;
                System.out.println("Congrats! You win!");
                return someOneWins;
            }
        }

        // condition3
        if((checkerBoard[0][0] == 'x' && checkerBoard[1][1] == 'x' && checkerBoard[2][2] == 'x') ||
                (checkerBoard[2][0] == 'x' && checkerBoard[1][1] == 'x' && checkerBoard[0][2] == 'x')){
            someOneWins = true;
            System.out.println("Congrats! You win!");
            return someOneWins;
        }


        // check the computer wins
        for (int j = 0; j < 3; j++) {
            if(checkerBoard[j][0] == 'x' && checkerBoard[j][1] == 'x' && checkerBoard[j][2] == 'x'){
                someOneWins = true;
                System.out.println("the computer wins.");
                return someOneWins;
            }
        }

        // condition2
        for (int j2 = 0; j2 < 3; j2++) {
            if(checkerBoard[0][j2] == 'o' && checkerBoard[1][j2] == 'o' && checkerBoard[2][j2] == 'o'){
                someOneWins = true;
                System.out.println("the computer wins.");
                return someOneWins;
            }
        }

        // condition3
        if((checkerBoard[0][0] == 'o' && checkerBoard[1][1] == 'o' && checkerBoard[2][2] == 'o') ||
                (checkerBoard[2][0] == 'o' && checkerBoard[1][1] == 'o' && checkerBoard[0][2] == 'o')){
            someOneWins = true;
            System.out.println("the computer wins.");
            return someOneWins;
        }

        return someOneWins;
    }

    public static boolean checkerBoardIsFull () {
        boolean isFull = true;
        for (int i = 0; i < checkerBoard.length; i++) {
            for (int j = 0; j < checkerBoard[i].length; j++) {
                if (checkerBoard[i][j] == ' '){
                    isFull = false;
                }
            }
        }
        if (isFull) {
            System.out.println("it is a tie!");
        }
        return isFull;
    }
}
