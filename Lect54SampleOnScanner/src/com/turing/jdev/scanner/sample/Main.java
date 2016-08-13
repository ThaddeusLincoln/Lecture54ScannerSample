package com.turing.jdev.scanner.sample;

import java.util.Scanner;

// A very simple sample where the interesting is the use of java.util.Scanner
public class Main {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int[] myIntegers = getInteger(5);
		
		for(int i = 0; i < myIntegers.length; i++){
			System.out.println("Element " + i + " typed value " + myIntegers[i]);
		}
		
		System.out.println("The averae is " + getAverage(myIntegers));
		
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
