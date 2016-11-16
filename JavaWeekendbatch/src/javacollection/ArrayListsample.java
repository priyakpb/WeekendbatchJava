package javacollection;

import java.util.ArrayList;

public class ArrayListsample {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		// String test[] = new String[10];

		cities.add("Paris");
		cities.add("London");
		cities.add("Bangalore");
		cities.add("Paris");

		for (String t : cities) {

			System.out.println(t);
		}

	}

}
