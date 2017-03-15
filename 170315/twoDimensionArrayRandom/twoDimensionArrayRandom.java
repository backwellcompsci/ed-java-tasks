/*
 * newBingoGame
 * Edward Callow
 * 1700315
 */

public class twoDimensionArrayRandom {
	private int[] [] Squares;
	int rows = 9;
	int columns = 4;

	public twoDimensionArrayRandom(){
		Squares = new int[rows] [columns];
	}

	public static void main(String[] args) {
		twoDimensionArrayRandom x = new twoDimensionArrayRandom();
		for (int n=0; n < x.Squares.length; n++) {
			for (int v=0; v < x.Squares[n].length; v++) {
				System.out.println(x.Squares[n].);
			}
		}
	}
}