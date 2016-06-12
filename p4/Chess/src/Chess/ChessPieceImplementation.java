package Chess;

public class ChessPieceImplementation implements ChessPiece {
    /**
     * Tipo de pieza.
     */
    Type pieceType;
    
    /**
     * Color de la pieza.
     */
    Color pieceColor;
    
    /**
     * Si ha sido movida alguna vez.
     */
    boolean isMoved;
    /**
    * Constructor de la clase ChessPieceImplementation
    * @param colour
    * @param tipo
    */
    ChessPieceImplementation(Color colour, Type tipo) {
        pieceColor = colour;
        pieceType = tipo;
        isMoved = false;
    }
    
    /**
    * Devuelve el color de la pieza
    * @return pieceColor
    */
    @Override
    public Color getColor() {
        return pieceColor;
    }
	
    /**
     * Esta función devuelve el tipo de la pieza
     * @return type
     */
    @Override
    public Type getType() {
        return pieceType;
    }

    /**
     * Cuando el tablero mueve una ficha, llama a esta función para notificarle
     * que la ha movido.
     */
    @Override
    public void notifyMoved(){
        isMoved = true;
    }

    /**
     * Esta función devuelve si la ficha se ha movido en algún momento de la 
     * partida o no.
     * @return true if notifyMoved was called once at least, false otherwise.
     */
    @Override
    public boolean wasMoved(){
        return isMoved;
    }
	
    /**
     * Devuelve un array con todas las posibles posiciones a las
     * que se puede mover una ficha.
     * @param aBoard Board containing the piece.
     * @return the array with the available positions where the piece can be moved.
     */

    @Override
    public PiecePosition[] getAvailablePositions(ChessBoard aBoard) {
        switch (getType()) {            
            case KING:
                return ChessMovementManager.getAvailablePositionsOfKing(this, aBoard);
            case QUEEN:
                return ChessMovementManager.getAvailablePositionsOfQueen(this, aBoard);
            case KNIGHT:
                return ChessMovementManager.getAvailablePositionsOfKnight(this, aBoard);                
            case BISHOP:
                return ChessMovementManager.getAvailablePositionsOfBishop(this, aBoard);
            case ROOK:
                return ChessMovementManager.getAvailablePositionsOfRook(this, aBoard);
            case PAWN:
                return ChessMovementManager.getAvailablePositionsOfPawn(this, aBoard);
            default:
                return null;
        }
    }
    
    /**
     * Dice si la pieza puede moverse o no.
     * @param aPosition Nuvea posicion de la pieza.
     * @param aBoard Tablero que contiene la pieza.
     * @return verdadero si la pieza puede mover, falso si no.
     */
    
    @Override
    public boolean canMoveToPosition(Chess.PiecePosition aPosition, Chess.ChessBoard aBoard) {
        Chess.PiecePosition[] positions = getAvailablePositions(aBoard);
        if (positions != null)
            for (Chess.PiecePosition position : positions)
                if (position.equals(aPosition))
                    return true;
        return false;
    }
}