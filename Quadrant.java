package com.bridgelabz;

public class Quadrant {

	public static void main(String args[]) {
		
		int x = -4, y = 6;
		if(x > 0 && y > 0) {
			System.out.println("Quadrant I(+x,+y)");
		}
		else if(x < 0 && y >0) {
			System.out.println("Quadrant II(-x,+y)");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Quadrant III(-x,-y)");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Quadrant IV(+x,-y)");
		}
		else if(x == 0 && y == 0) {
			System.out.println("Origin");
		}
	}
}
