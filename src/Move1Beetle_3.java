
public class Move1Beetle_3 {

	public static void main(String[] args) {
		//create beetles and set position if needed
		Beetle bailey = new Beetle("green");
		
		//draw octagon beetles
		drawOctagon(bailey);
		//drawOctagon(ed);
		
		
	}

	private static void drawOctagon(Beetle name) {
		double move = 60;
		double turn = 45;
		for (int count = 1; count <= 8; count = count + 1) {
			name.move(move);
			name.getPosition();
			name.turn(turn);
		}
	}
	
	
}


