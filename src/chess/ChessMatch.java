package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.Rook;

public class ChessMatch {
	
	//Classe destinada as regras do jogo
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int x=0; x< board.getRows(); x++) {
			for(int y=0; y<board.getColumns(); y++ ) {
				mat[x][y] = (ChessPiece) board.piece(x,y);
			}
		}
		return mat; 
	}
	
	//Setup Inicial do Jogo, coloca as peças no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
	}
}
