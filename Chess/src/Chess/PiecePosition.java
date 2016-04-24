package Chess;

public class PiecePosition {

	/**
	 * Comprueba si la posición esta entre los límites del tablero
         * @param column
         * @param row
         * @return verdadero o falso
	 */
	public static boolean isAvailable(int column, int row) {
		return column >= 0 && column < 8 && row >= 0 && row < 8;
	}

	/**
	 * Comprueba si una pieza puede moverse a una posición dada
         * @param position
         * @param columnIncrement
         * @param rowIncrement
         * @return verdadero o falso
	 */
	static boolean isAvailable(PiecePosition position, int columnIncrement, int rowIncrement) {
		if (position == null)
			return false;
		
		int newColumn = position.getColumn() + columnIncrement;
		int newRow = position.getRow() + rowIncrement;
		return isAvailable(newColumn, newRow);
	}

	/**
	 * Comprueba si una pieza está en una posición valida.
         * @param position
         * @return verdadero o falso
	 */
	static boolean isAvailable(PiecePosition position) {
		if (position == null)
			return false;
		return isAvailable(position.getColumn(), position.getRow());
	}
        /**
         * Variables enteras para columna y fila
         */
	private int column, row;

	/**
	 * Constructor donde se asigna valor a columna y fila
         * @param column
         * @param row
	 */
	public PiecePosition(int column, int row) {
		this.column = column;
		this.row = row;
	}
	
	/**
	 * Devuelve el valor entero de una columna
         * @return column
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * Devuelve el valor entero de una fila
         * @return 
	 */
	public int getRow() {
		return row;
	}
        
	/**
         * Asigna los valores de columna y fila tras comprobar si es una posición valida.
         * @param column
         * @param row
         * @return verdadero si asigna valores o falso si no es posible.
         * */
	public boolean setValues(int column, int row) {
		if (isAvailable(column, row)) {
			this.column = column;
			this.row = row;			
			return true;
		}
		return false;
	}
	
	/**
	 * Comprueba si la posición a la que se va a mover esta libre
         * Si lo está crea una nueva pieza y si no devuelve nulo.
         * @param columnCount
         * @param rowCount
         * @return la pieza o nulo
	 */
	public PiecePosition getDisplacedPiece(int columnCount, int rowCount) {		
		if (!isAvailable(this, columnCount, rowCount))
			return null;
		int newColumn = getColumn() + columnCount;
		int newRow = getRow() + rowCount;
		return new PiecePosition(newColumn, newRow);
	}
	
	/**
	 * Crea una nueva pieza en el mismo lugar que la anterior.
         * @return nueva pieza en el mismo sitio
	 */
        @Override
	public PiecePosition clone() {
		return new PiecePosition(column, row);
	}
	
	/**
	 * Comprueba si dos piezas estan en la misma posición.
         * @param aPosition
         * @return verdadero o falso
	 */
	public boolean equals(PiecePosition aPosition) {
		return aPosition.getColumn() == getColumn() && aPosition.getRow() == getRow();
	}
}
