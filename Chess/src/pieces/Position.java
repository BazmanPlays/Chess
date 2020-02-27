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
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public int[] get() { int[] t = {x, y}; return t; }
	
	public static int[] getDistance(Position pos, Position pos1) {
		int[] dist = { pos.getX() - pos1.getX(), pos.getY() - pos1.getY()};
		return dist;
	}
	
	public boolean equals(Position pos1) { return Arrays.equals(this.get(), pos1.get()); }
	
	public boolean isDiagonal(Position pos1) { 
		return Math.abs(this.getX() - pos1.getX()) == Math.abs(this.getY() - pos1.getY()); 
	}
	
	
}
