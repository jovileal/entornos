/**
 * @author Jose Vicente
 * @Version 1.0 6.03.2016
 */
package tresenraya;

/**
 * 
 * Inicio de la clase
 */
public class NoughtsAndCrossesBoardImplementation implements NoughtsAndCrossesBoard  {
    
    Color [][] board = new Color [3][3];
    /**
     * Inicio del tablero
     */
    public NoughtsAndCrossesBoardImplementation(){
        board[0][0] = Color.RED;
        board[0][1] = Color.WHITE;
        board[0][2] = Color.RED;
        board[1][0] = Color.VOID;
        board[1][1] = Color.RED;
        board[1][2] = Color.VOID;
        board[2][0] = Color.WHITE;
        board[2][1] = Color.VOID;
        board[2][2] = Color.WHITE;
    }
  
    /**
     * Devuelve si se termine o no la partida
     * @return 
     */
    @Override
    public boolean isGameOver() {
       if (((getPieceAt(0,0)==Color.RED) &&  (getPieceAt(0,1)==Color.RED) && (getPieceAt(0,2)==Color.RED)) 
                || ((getPieceAt(0,0)==Color.WHITE) &&  (getPieceAt(0,1)==Color.WHITE) && (getPieceAt(0,2)==Color.WHITE))) 
            return true;
        else if (((getPieceAt(1,0)==Color.RED) &&  (getPieceAt(1,1)==Color.RED) && (getPieceAt(1,2)==Color.RED)) 
                || ((getPieceAt(1,0)==Color.WHITE) &&  (getPieceAt(1,1)==Color.WHITE) && (getPieceAt(1,2)==Color.WHITE))) 
            return true;
        else if (((getPieceAt(2,0)==Color.RED) &&  (getPieceAt(2,1)==Color.RED) && (getPieceAt(2,2)==Color.RED)) 
                || ((getPieceAt(2,0)==Color.WHITE) &&  (getPieceAt(2,1)==Color.WHITE) && (getPieceAt(2,2)==Color.WHITE))) 
            return true;
        else if (((getPieceAt(0,0)==Color.RED) &&  (getPieceAt(1,0)==Color.RED) && (getPieceAt(2,0)==Color.RED)) 
                || ((getPieceAt(0,0)==Color.WHITE) &&  (getPieceAt(1,0)==Color.WHITE) && (getPieceAt(2,0)==Color.WHITE))) 
            return true;
        else if (((getPieceAt(0,1)==Color.RED) &&  (getPieceAt(1,1)==Color.RED) && (getPieceAt(2,1)==Color.RED)) 
                || ((getPieceAt(0,1)==Color.WHITE) &&  (getPieceAt(1,1)==Color.WHITE) && (getPieceAt(2,1)==Color.WHITE))) 
            return true;
        else if (((getPieceAt(0,2)==Color.RED) &&  (getPieceAt(1,2)==Color.RED) && (getPieceAt(2,2)==Color.RED)) 
                || ((getPieceAt(0,2)==Color.WHITE) &&  (getPieceAt(1,2)==Color.WHITE) && (getPieceAt(2,2)==Color.WHITE))) 
            return true;    
        else if (((getPieceAt(0,0)==Color.RED) &&  (getPieceAt(1,1)==Color.RED) && (getPieceAt(2,2)==Color.RED)) 
                || ((getPieceAt(0,0)==Color.WHITE) &&  (getPieceAt(1,1)==Color.WHITE) && (getPieceAt(2,2)==Color.WHITE))) 
            return true;
        else return ((getPieceAt(0,2)==Color.RED) &&  (getPieceAt(1,1)==Color.RED) && (getPieceAt(2,0)==Color.RED)) 
                || ((getPieceAt(0,2)==Color.WHITE) &&  (getPieceAt(1,1)==Color.WHITE) && (getPieceAt(2,0)==Color.WHITE));
    }    
    
 
    /**
     * Devuelve si la pieza se puede mover de la posicion inicial a la final, Y hace el cambio de posicion
     * @param fromX
     * @param fromY
     * @param toX
     * @param toY
     * @return 
     */
    @Override
    public boolean movePiece(int fromX, int fromY, int toX, int toY) {
        if ((toX >=0 && toX <= 2) &&( toY >=0 && toY <= 2) 
            &&( fromX >=0 && fromX <= 2) && ( fromY >=0 && fromY <= 2) 
            && getPieceAt(toX,toY)==Color.VOID) {
                board[toX][toY] = board[fromX][fromY];
                board[fromX][fromY] = Color.VOID;
                return true;
        }
        return false;
    }
    /**
     * Devuelve el color de la pieza en la posicion x e y.
     * @param x
     * @param y
     * @return 
     */
    @Override
    public Color getPieceAt(int x, int y) {
        if ((x >=0) && (x < 3) && ( y >=0) && (y < 3))
            return board[x][y];
        return Color.VOID;
    }
    /**
     * Devuelve si puede moverse o no a la posicion indicada.
     * @param x
     * @param y
     * @return 
     */
    @Override
    public boolean canMovePieceAt(int x, int y) {
        return (x >= 0) && ( x < 3) &&( y >=0) && (y < 3) && (getPieceAt(x,y) != Color.VOID);
    } 
}