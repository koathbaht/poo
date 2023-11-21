public class Pawn extends Piece{
    private boolean firtsMove = true;

    public Pawn(byte posx, byte posy, boolean color) {
        super(posx, posy, color, pawnSymbol);
    }

    @Override
    boolean tryMove(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy)
    {
        if(firtsMove) {
            boolean firstMove = false;

        }
        else
        {

        }
        return true;
    }
}
