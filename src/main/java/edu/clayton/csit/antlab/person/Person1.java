package edu.clayton.csit.antlab.person;

/**
 * A simple class for person 1
 * returns their name and a
 * modified string
 * 
 * @author Qu
 * @version 1.1
 */
public class Person1 {
	/** Holds the persons real name */
	private String name;

	/**
	 * The constructor, takes in the persons
	 * name
	 * 
	 * @param pname the person's real name
	 */
	public Person1(String pname) {
		name = pname;
	}

	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
		// Person 1 put your implementation here
		if (input == null || input.isEmpty()) {
			return input;
		}

		int positions = 2;
		int length = input.length();
		positions %= length; // Ensure positions is within the string length

		// Rotate the string by splitting it into two parts and swapping them
		String rotated = input.substring(positions) + input.substring(0, positions);

		return rotated;
	}

	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
		return name + calc(input);
	}

}
