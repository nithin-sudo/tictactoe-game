package com.bridgelabz.tictactoegame;
import java.util.Scanner;
public class TicTacToe {
    Scanner scanner = new Scanner(System.in);
    public static char[] board;
    /**
     * Printing the welcome message and calling the methods from main.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe game");
        createBoard();
        userOption();
        displayBoard();
        indexBoard();
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
        char userChoice=scanner.next().charAt(0);
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
        int REDIX=10;
        System.out.println("\n");
        for( int i=1; i<10; i++)
        {
            if (board[i] !='x' && board[i] !='o') {
                board[i] = Character.forDigit(i, REDIX);
            }
        }
        displayBoard();
    }
}