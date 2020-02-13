package net.cox.augies.utils.java;

public class StringUtils {
	public static int nIndexOf(int num, String substring, String string) {
		if(num>occurrencesOf(substring, string)) {
			return -1;
		}
		int index = 0;
		for(int i = 0; i < num; i++) {
			index += string.indexOf(substring)+substring.length();
			string = string.substring(string.indexOf(substring)+substring.length(), string.length());
		}
		index -= substring.length();
		return index;
	}
	
	public static int occurrencesOf(String substring, String string) {
		int occurrences = 0;
		while(string.contains(substring)) {
			occurrences++;
			string = string.substring(string.indexOf(substring)+substring.length(),string.length());
		}
		return occurrences;
	}
}
