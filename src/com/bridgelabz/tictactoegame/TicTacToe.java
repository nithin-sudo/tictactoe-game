package com.bridgelabz.tictactoegame;

import java.util.Scanner;

public class TicTacToe {
    /**
     * Printing a welcome message and calling createBoard method.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe game");
        createBoard();
        userOption();
    }
    /**
     * Creating board with empty spaces.
     * @return
     */
    private static char[] createBoard(){
        char[] board=new char[10];
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
            if (userChoice == userChoice) {
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
}