public class Rook extends Piece{
    public Rook(byte posx, byte posy, boolean color) {
        super(posx, posy, color, rookSymbol);
    }

    @Override
    boolean tryMove(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy) {
         return true;
    }
}
