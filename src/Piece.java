import java.util.Arrays;

public abstract class Piece {

    public final static String
        bishopSymbol = "b",
        pawnSymbol = "p",
        knightSymbol = "n",
        rookSymbol = "r",
        queenSymbol = "Q",
        kingSymbol = "K";


    public final static byte
            bishopValue = 3,
            pawnValue = 1,
            knightValue = 3,
            rookValue = 4,
            queenValue = 9,
            kingValue = 0;

    private byte posx, posy;
    private boolean color;
    private String type;

    private byte value;


    public Piece(byte posx, byte posy, boolean color, String type) {
        this.posx = posx;
        this.posy = posy;
        this.color = color;
        this.type = type;
    }

    public void move(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy)
    {
        if(board[toy][tox] != -1)
        {
            if(pieces[board[toy][tox]].isColor()) Board.whitePieceScore += pieces[board[toy][tox]].getValue();
            else Board.blackPieceScore += pieces[board[toy][tox]].getValue();
        }

        board[toy][tox] = board[fromy][fromx];
        board[fromy][fromx] = (byte)-1;
    }
    abstract boolean tryMove(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy);

    public byte getValue() {
        return value;
    }
    public boolean isColor() {
        return color;
    }
    public String getType() {
        return type;
    }
}
