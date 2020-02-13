package net.cox.augies.utils.java;

/**
 * Math-related utilities
 * @author Augies
 *
 */
public class MathUtils {
	/**
	 * Generates a random integer
	 * @param lower the lower bound (inclusive)
	 * @param upper the upper bound (inclusive)
	 * @return a random integer between the given bounds
	 */
	public static int randomWithRange(int lower, int upper) {
		return (int)(Math.random()*(upper-lower+1)+lower);
	}
	
	/**
	 * Checks if a given double is a whole number
	 * @param a the double to be checked
	 * @return whether or not it is a whole number
	 */
	public static boolean canBeInt(double a) {
		return Double.toString(a).substring(Double.toString(a).length()-2,Double.toString(a).length()).equals(".0");
	}
}
