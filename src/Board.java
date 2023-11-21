import java.io.IOException;
import java.util.Arrays;

public class Board {

    private static boolean turn = false;

    public static byte
            whitePieceScore = 0,
            blackPieceScore = 0;

    private static final boolean
            white = false,
            black = true;

    private static final boolean[] byteTooBool = {white, black};

    private static final byte
            black_frRow = 6,
            black_bkRow = 7,
            white_frRow = 1,
            white_bkRow = 0,
            blackOffset = 24,
            queenStPos = 3,
            kingtPos = 4;
    private static final byte[]
            rookStPos = {(byte)0, (byte)7},
            knightStPos = {(byte)1, (byte)6},
            bishopStPos = {(byte)2, (byte)5},
            bkRows = {white_bkRow, black_bkRow};

    private static final String
            blue_txt = "\u001B[34m", red_txt = "\u001B[32m",
            black_bg = "\u001B[40m", white_bg = "\u001B[41m",
            rstCol = "\u001B[0m";

    static public boolean chkMvInBrd(byte tox, byte toy)
    {
        if(0 <= tox && tox < 8 && 0 <= toy && toy < 8) return true;
        else return false;
    }

    static final byte[][] initBoard(Piece[] pieces) {

        byte[][] board = new byte[8][8];
        for(int i = 0; i < 8; i++) Arrays.fill(board[i], (byte) -1);

        //init pawns
        byte ind;
        for(ind = 0; ind < 8; ind++)
        {
            pieces[ind] = new Pawn(ind, white_frRow, white);
            board[white_frRow][ind] = ind;

            pieces[ind + blackOffset] = new Pawn(ind, white_frRow, black);
            board[black_frRow][ind] = (byte)(ind + blackOffset);
        }
        for(byte i = 0; i < 2; i++) {
            for(byte j = 0; j < 2; j++) {
                pieces[ind] = new Rook(rookStPos[j], bkRows[i], byteTooBool[i]);
                board[bkRows[i]][rookStPos[j]] = ind;
                ind++;

                pieces[ind] = new Knight(knightStPos[j], bkRows[i], byteTooBool[i]);
                board[bkRows[i]][knightStPos[j]] = ind;
                ind++;

                pieces[ind] = new Bishop(bishopStPos[j], bkRows[i], byteTooBool[i]);
                board[bkRows[i]][bishopStPos[j]] = ind;
                ind++;
            }
        }

//        for(byte i = 0; i < 2; i++) {
//            pieces[ind] = new Queen();
//        }

        return board;
    }

    static void printBoard(byte[][] board, Piece[] pieces) throws IOException, InterruptedException {

        //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        for(int i = 7; i >= 0; i--)
        {
            for(int j = 0; j < 8; j++)
            {
                String bgCol, symbolColor = "", pieceType = " ";

                if((i * 9 + j) % 2 != 1) bgCol = black_bg;
                else bgCol = white_bg;

                if(board[i][j] != -1)
                {
                    // se alege culoarea textului in functie de culoarea piesei
                    // se alege pieceType in functie de elem de la indexul din pieces
                    pieceType = pieces[board[i][j]].getType();
                    if(pieces[board[i][j]].isColor() == white) symbolColor = blue_txt;
                    else symbolColor = red_txt;
                }
                else pieceType = " ";

                System.out.print(bgCol + symbolColor + " " + pieceType + " " + rstCol);
            }
            System.out.print("\n");
        }
    }

    public static void switchTurn() {
        turn = !turn;
    }

    public static boolean getTurn() {
        return turn;
    }
}
