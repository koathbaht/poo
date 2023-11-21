import java.sql.SQLOutput;

public class King extends Piece{
    public King(byte posx, byte posy, boolean color) {
        super(posx, posy, color, kingSymbol);
    }

    @Override
    boolean tryMove(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy)
    {
        System.out.println("King");
        return true;
    }
}
