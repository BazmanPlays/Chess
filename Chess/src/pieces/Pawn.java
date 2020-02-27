package pieces;

public class Pawn extends Piece {
	private boolean isMoved = false;
	
	
	public Pawn(Color color, Position pos) {
		super(color, pos);
	}

	public void move(Position go) {
		isMoved = true;
		if(!check(go)) 
			System.out.println("Cannot move to this position");
//		else if (go.getX().){
//			
//		}
	} 
	
	
	//Finish check() w/ if that piece can move in that way, then hit detection,
	//And keep in mind that black up top, white down below
	//Simplify attack w/ attackPos()
	//Fuckin' Get good 4Head
	protected boolean check(Position go) {
		
		
		if(Piece.hasPosition(go) != null) {
			
		}
		
		return false;
	}
	protected boolean attack(Position go) {
		
		if(Math.abs(this.getPosition().getX() - go.getX()) == 1 && Math.abs(this.getPosition().getY() - go.getY()) == 1)
			return true;
		
		return false;		
	}
	

	
}
