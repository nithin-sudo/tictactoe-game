package com.bridgelabz.tictactoegame;
import java.util.Scanner;
public class TicTacToe {
    public static Scanner scanner = new Scanner(System.in);
    public static char userChoice;
    public static char[] board;
    /**
     * Printing the welcome message and calling the methods from main.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe game");
        whoPlaysFirst();
        createBoard();
        userOption();
        displayBoard();
        indexBoard();
        desiredUSerMove();
    }
    /**
     * Creating board with empty spaces.
     * @return
     */
    private static char[] createBoard(){
        board=new char[10];
        for(int i=1;i<board.length;i++){
            board[i]='-';
        }
        return board;
    }
    /**
     *asking user to choose between x or o.
     */
    private static void userOption(){
        System.out.println("Choose between x or o : ");
        Scanner scanner = new Scanner(System.in);
        userChoice=scanner.next().charAt(0);
        char computerChoice;
        if (userChoice == 'x' || userChoice == 'o') {
            if (userChoice == 'x') {
                computerChoice = 'o';
                System.out.println("Player has chosen " + userChoice + " and computer is  "+computerChoice);
            } else {
                computerChoice = 'x';
                System.out.println("Player has chosen " + userChoice + " and computer is "+computerChoice);
            }
        }
        else
        {
            System.out.println("Enter only x or o");
            userOption();
        }
    }
    /**
     * displaying the current board.
     */
    private static void displayBoard()
    {
        System.out.println("The Current Board is:");
        System.out.println("| " + board[1] + " | "+ board[2] + " | " + board[3]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "+ board[5] + " | " + board[6]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "+ board[8] + " | " + board[9]+ " |");
    }
    /**
     * printing the index board from where user can select number to ake his move.
     */
    private static void indexBoard(){
        System.out.println("choose the number where you want to enter your character:");
        int lastNumber=10;
        System.out.println("\n");
        for( int i=1; i<10; i++)
        {
            if (board[i] !='x' && board[i] !='o') {
                board[i] = Character.forDigit(i, lastNumber);
            }
        }
        displayBoard();
    }
    /**
     * Taking input from user and assigning user choice to the number in the index board accordingly.
     */
    public static void desiredUSerMove() {
        System.out.println("\nEnter a slot number between 1 and 9 :\n");
        int chooseNumber=scanner.nextInt();
        if (chooseNumber > 0 && chooseNumber <= 9 && board[chooseNumber]!='x' && board[chooseNumber]!='o')
        {
            board[chooseNumber]=userChoice;
            System.out.println(board[chooseNumber]);
            indexBoard();
        }
        else
        {
            System.out.println("Invalid input");
            desiredUSerMove();
        }
    }
    /**
     * doing a toss to check who is going to play first.
     */
    public static void whoPlaysFirst() {
        double toss = (Math.floor(Math.random() * 10) % 2)+1;
        System.out.println("toss is :" + toss);
        System.out.println("choose your choice 1.head 2.tail");
        int choice = scanner.nextInt();
        if (choice == 1)
        {
            System.out.println("player's turn");
        }
        else if (choice == 2)
        {
                System.out.println("computer's turn");
        }
        else
        {
            System.out.println("invalid input ");
            whoPlaysFirst();
        }
    }
}