package org.example.board;


import java.util.Arrays;

/**
 * @author milad mofidi
 * user: miladm on 1/8/2023
 */
public class GameService
{
    //initializing board with 10 cells

    public static String[] initBoard()
    {
        String[] board = new String[9];
        for (int a = 0; a < 9; a++)
        {
            board[a] = String.valueOf(a + 1);
        }
        return board;
    }

    // To print out the board.
	/* |---|---|---|
	| 1 | 2 | 3 |
	|-----------|
	| 4 | 5 | 6 |
	|-----------|
	| 7 | 8 | 9 |
	|---|---|---|*/

    public static void printBoard(String[] board)
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                           + board[1] + " | " + board[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                           + board[4] + " | " + board[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                           + board[7] + " | " + board[8]
                           + " |");
        System.out.println("|---|---|---|");
    }

    // CheckWinner method will
    // decide the combination
    // of three box given below.
    public static String checkWinner(String[] board, String turn)
    {
        for (int a = 0; a < 8; a++)
        {
            String line = null;

            switch (a)
            {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX"))
            {
                return "X";
            }

            // For O winner
            else if (line.equals("OOO"))
            {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++)
        {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1)))
            {
                break;
            }
            else if (a == 8)
            {
                return "draw";
            }
        }

        // To enter the X Or O at the exact place on board.
        System.out.println(
                turn + "'s turn; enter a slot number to place "
                + turn + " in:");
        return null;
    }
}
