public class Knight extends Piece{
    public Knight(byte posx, byte posy, boolean color) {
        super(posx, posy, color, knightSymbol);
    }

    @Override
    boolean tryMove(byte[][] board, Piece[] pieces, byte fromx, byte fromy, byte tox, byte toy) {
        if(!(((abs((byte)(tox - fromx)) == 2 && abs((byte)(toy - fromy)) == 1) ||
            (abs((byte)(tox - fromx)) == 1 && abs((byte)(toy - fromy)) == 2)) &&
            (board[toy][tox] == (byte)-1 ||
            pieces[board[toy][tox]].isColor() != pieces[board[fromy][fromx]].isColor())))
        {
            System.out.println("Not a valid knight move");
            return false;
        }
        else return true;
    }

    private byte abs(byte x)
    {
        if(x > 0) return x;
        else return (byte)-x;
    }
}
