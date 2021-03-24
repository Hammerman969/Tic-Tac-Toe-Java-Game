package com.company;

import com.sun.jdi.PathSearchingVirtualMachine;

import javax.print.MultiDocPrintService;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Main {

    private static String user;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while (true){
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter your placement (1-9):");
            int playerPosition = scanner.nextInt();

            placePice (gameBoard, playerPosition,"player");

            Random rand = new Random();
            int cpuPosition = rand.nextInt(9) + 1;
            placePice (gameBoard, cpuPosition,"cpu");
            printGameBoard(gameBoard);

            switch (playerPosition){
                case 1:
                    gameBoard [0][0] = 'X';
                    break;

            } switch (playerPosition){
                case 2:
                    gameBoard [0][2] = 'X';
                    break;

           } switch (playerPosition){
                case 3:
                    gameBoard [0][4] = 'X';
                    break;

            } switch (playerPosition){
                case 4:
                    gameBoard [2][0] = 'X';
                    break;

            } switch (playerPosition){
                case 5:
                    gameBoard [2][2] = 'X';
                    break;

            } switch (playerPosition){
                case 6:
                    gameBoard [2][4] = 'X';
                    break;

            } switch (playerPosition){
                case 7:
                    gameBoard [4][0] = 'X';
                    break;

            } switch (playerPosition){
                case 8:
                    gameBoard [4][2] = 'X';
                    break;

            } switch (playerPosition){
                case 9:
                    gameBoard [4][4] = 'X';
                   break;

            }
        }

        //printGameBoard(gameBoard);
    }

    private static void placePice(char[][] gameBoard, int position, String player) {
    }

    public static void printGameBoard(char [][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece (char [][] gameBoard, int position, String user){
	     char symbol = ' ';
	     if (user.equals("player")){
	         symbol = 'X';
         } else if (user.equals("cpu")){
	         symbol = '0';
         }

        switch (position){
            case 1:
                gameBoard [0][0] = symbol;
                break;

        } switch (position){
            case 2:
                gameBoard [0][2] = symbol;
                break;

        } switch (position){
            case 3:
                gameBoard [0][4] = symbol;
                break;

        } switch (position){
            case 4:
                gameBoard [2][0] = symbol;
                break;

        } switch (position){
            case 5:
                gameBoard [2][2] = symbol;
                break;

        } switch (position){
            case 6:
                gameBoard [2][4] = symbol;
                break;

        } switch (position){
            case 7:
                gameBoard [4][0] = symbol;
                break;

        } switch (position){
            case 8:
                gameBoard [4][2] = symbol;
                break;

        } switch (position){
            case 9:
                gameBoard [4][4] = symbol;
                break;
            default:
                break;

             }

        }
    }
