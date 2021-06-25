package com.bridgelabz.tictactoegame;
public class TicTacToe {
    /**
     * Printing a welcome message and calling createBoard method.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to tic tac toe game");
        createBoard();
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
}