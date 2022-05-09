import java.util.ArrayList;
import java.util.Scanner;

public class MovieSelection {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Movie> movies = new ArrayList();
		String cont;
		movies.add(new Movie("The Fellowship of the Ring", "Action"));
		movies.add(new Movie("Who Am I?", "Action"));
		movies.add(new Movie("The Gentlemen", "Action"));
		movies.add(new Movie("Karate Kid", "Action"));
		movies.add(new Movie("Why Him?", "Comedy"));
		movies.add(new Movie("Night School", "Comedy"));
		movies.add(new Movie("The Princess Bride", "Comedy"));
		movies.add(new Movie("A Quiet Place", "Horror"));
		movies.add(new Movie("It", "Horror"));
		movies.add(new Movie("Get Out", "Horror"));

		do {
			System.out.println("Welcome to Jack's Theatre! \nPlease select either Horror, Comedy, or Action");
			String genre = scan.next();

			if (genre.equalsIgnoreCase("horror")) {
				System.out.println("Excellent choice! Our Horror movies are as follows:");
				movies.toArray();
				System.out.println(movies.get(7).toString());
				System.out.println(movies.get(8).toString());
				System.out.println(movies.get(9).toString());
			} else if (genre.equalsIgnoreCase("Comedy")) {
				System.out.println("Excellent choice! Our Comedy movies are as follows:");
				movies.toArray();
				System.out.println(movies.get(4).toString());
				System.out.println(movies.get(5).toString());
				System.out.println(movies.get(6).toString());
			} else if (genre.equalsIgnoreCase("action")) {
				System.out.println("Excellent choice! Our Action movies are as follows:");
				movies.toArray();
				System.out.println(movies.get(0).toString());
				System.out.println(movies.get(1).toString());
				System.out.println(movies.get(2).toString());
				System.out.println(movies.get(3).toString());
			} else {
				System.out.println("Please enter a valid movie genre! We provide Action, Comedy, and Horror Movies");
			}
			System.out.println("Would you like to continue? (y/n)");
			cont = scan.next();
		} while (cont.equalsIgnoreCase("y"));
		System.out.println("Thanks for visiting Jack's Theatre! Have a nice day!");
		scan.close();
	}

}

