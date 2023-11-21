//made by DanHumeniuc

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Piece[] pieces = new Piece[32];

        byte[][] board = Board.initBoard(pieces);

        Board.printBoard(board, pieces);

        Scanner input = new Scanner(System.in);

        byte fromx = 0, fromy, tox, toy;
        boolean currentTurn = false;
        short turnNr = 0;

        while(fromx != -1) {
            fromx = input.nextByte(); fromy = input.nextByte();

            if(!Board.chkMvInBrd(fromx, fromy)) {
                System.out.println("Pozitie in afara tablei de sah!");
                continue;
            }

            if(!(board[fromy][fromx] != -1 &&
                pieces[board[fromy][fromx]].isColor() == currentTurn)) {
                System.out.println("Nu exista o piesa pe care sa o poti muta la acea pozitie!");
                continue;
            }

            tox = input.nextByte(); toy = input.nextByte();

            if(!Board.chkMvInBrd(tox, toy)) {
                System.out.println("Pozitie in afara tablei de sah!");
                continue;
            }

            if(!pieces[board[fromy][fromx]].tryMove(board, pieces, fromx, fromy, tox, toy)) {
                System.out.println("Mutare invalida pentru aceasta piesa");
                continue;
            }

            // mutarea efectiva
            if(!Board.getTurn()) turnNr++;
            Board.switchTurn();

            pieces[board[fromy][fromx]].move(board, pieces, fromx, fromy, tox, toy);

            Board.printBoard(board, pieces);
        }
    }
}