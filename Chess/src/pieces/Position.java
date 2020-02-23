package pieces;

import java.util.Arrays;

public class Position {
	private int x, y;
	
	public Position(int x, int y) {
		if(x > 7 || x < 0)
			throw new IllegalArgumentException("Out of Bounds Position!");
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	public int[] get() {
		int[] t = {x, y};
		return t;
	}
	public boolean equals(Position pos1) {
		return Arrays.equals(this.get(), pos1.get());
	}
	
	public boolean isDiagonal(Position pos1) {
		boolean[] test = { pos1.getX() + 1 == this.getX(), pos1.getX() - 1 == this.getX(), pos1.getY() + 1 == this.getY(), pos1.getY() - 1 == this.getY() };
		boolean[] test1 = { test[0] || test[1], test[2] || test[3] };
		return test1[0] && test1[1];
	}
	public Piece hasPosition(Position pos1) {
		Piece[] pieces = new Piece[Piece.count];
		for (Piece p : pieces) {
			if(p.equals(pos1))
				return p;
				
		}
		return null;
	}
}
