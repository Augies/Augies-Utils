package net.cox.augies.utils.java;

import java.util.ArrayList;

public class ArrUtils {
	
	public static void printArray(Object[] arr) {
		String s = "[";
		for(Object i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(int[] arr) {
		String s = "[";
		for(int i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(short[] arr) {
		String s = "[";
		for(short i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(long[] arr) {
		String s = "[";
		for(long i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(float[] arr) {
		String s = "[";
		for(float i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(double[] arr) {
		String s = "[";
		for(double i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(char[] arr) {
		String s = "[";
		for(char i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static void printArray(byte[] arr) {
		String s = "[";
		for(byte i : arr) {
			s+=i + ",";
		}
		s=s.substring(0,s.length()-1) + "]";
	}
	
	public static int getInstances(ArrayList<Object> arr, Object obj) {
		int instancenum = 0;
		while(arr.contains(obj)) {
			instancenum++;
			arr.remove(obj);
		}
		return instancenum;
	}
	
	public static ArrayList<Object> getNonDuplicate(ArrayList<Object> arr){
		ArrayList<Object> arr2 = new ArrayList<Object>();
		for(Object i : arr) {
			if(!arr2.contains(i)) {
				arr2.add(i);
			}
		}
		return arr2;
		
	}
}
