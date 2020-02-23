package pieces;

public class Pawn extends Piece {
	private boolean isMoved = false;
	
	
	public Pawn(Color color, Position pos) {
		super(color, pos);
	}

	public void Move(Position go) {
		isMoved = true;
		if(!Check())
			System.out.println("Cannot move to this position");
		//else if (go.getX().){
			
		//}
	} 
	protected boolean Check() {
		return true;
	}
	protected boolean Attack() {
		
		return true;
	}
	
}
