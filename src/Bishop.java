public class Bishop extends Piece {
    public Bishop(byte posx, byte posy, boolean color) {
        super(posx, posy, color, bishopSymbol);
    }

    @Override
    boolean tryMove(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy) {
        System.out.println("Bishop");
        return true;
    }
}
