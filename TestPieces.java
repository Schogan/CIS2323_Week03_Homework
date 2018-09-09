import pieces.*;

public class TestPieces{
	public static void main(String[] args){
		//Test piece A
		chessPiece pieceA = new chessPiece();
		System.out.println("This is the first test piece ");
		
		pieceA.setColor("white");
		pieceA.setPosition(1,1);
		pieceA.setPieceType("LeftSideRook");
		
		String pieceAstatus = pieceA.printInfo();
		System.out.println(pieceAstatus);
		
		//Test piece B
		chessPiece pieceB = new chessPiece();
		System.out.println("This is the second test piece ");
		
		pieceB.setColor("black");
		pieceB.setPosition(8,2);
		pieceB.setPieceType("RightSideBishop");
		
		String pieceBstatus = pieceB.printInfo();
		System.out.println(pieceBstatus);
		
		
	}	
}