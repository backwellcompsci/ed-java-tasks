/*
 * MovieTestDrive
 * Edward Callow
 * 170119
 */

class Movie {
	String title;
	String genre;
	int rating;
	void playIt() {
		System.out.println("Playing the movie");
	}
}

public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title = "La La Land";
		two.genre = "Entertainment";
		two.rating = 4;
		Movie three = new Movie();
		three.title = "Deadpool";
		three.genre = "Comedy";
		three.rating = 2;
		two.playIt();
	}
}