package applicantion;

import chess.ChessMate;

public class Program {

	public static void main(String[] args) {
		
		ChessMate chessMate = new ChessMate();
		UI.printBoard(chessMate.getPieces());
	}
	
}
