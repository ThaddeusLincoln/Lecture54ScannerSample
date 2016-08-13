package com.turing.jdev.scanner.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// A very simple sample where the interesting is the use of java.util.Scanner
// and also the Arrays.copyOf
public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[] myIntegers = getInteger(5);
		
		for(int i = 0; i < myIntegers.length; i++){
			System.out.println("Element " + i + " typed value " + myIntegers[i]);
		}
		
		System.out.println("The averae is " + getAverage(myIntegers));
		
		int[] aCopyOfTheIntegers = Arrays.copyOf(myIntegers, myIntegers.length);
		for(int i = 0; i < aCopyOfTheIntegers.length; i++){
			System.out.println("Element " + i + " typed value " + aCopyOfTheIntegers[i]);
		}
		
		// Also how to create an ArrayList from another array
		List<String> languagesList = new ArrayList<String>();
		languagesList.add("Java");
		languagesList.add("C#");
		
		// 1.
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(languagesList);
		
		// 2.
		ArrayList<String> nextArray = new ArrayList<String>(languagesList);
		for(String language : nextArray){
			System.out.println(language);
		}
		
		// 3. convert list to array
		String[] languagesArray = new String[languagesList.size()];
		languagesArray = languagesList.toArray(languagesArray);
		
	}
	
	// the interesting is the use of java.util.Scanner 
	public static int[] getInteger(int number){
		
		System.out.println("Please enter " + number + " integer values");
		int[] values = new int[number];
		
		for(int i = 0; i < values.length; i++){
			values[i] = scanner.nextInt();
		}
		
		return values;
	}
	
	public static double getAverage(int[] myArray){
		
		int sum = 0;
		for(int i = 0; i < myArray.length; i++){
			sum += myArray[i];
		}
	
		// so ugly
		return (double) sum / (double) myArray.length;
		
		
		
		
	}
	
}
