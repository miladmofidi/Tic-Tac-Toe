package org.example.board;

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
}
