package com.primitivedatatypes;

public class FloatDouble1 {

	public static void main(String[] args) {

		// width of an integer = 32 (4 bytes).
		int myIntValue = 5 / 3;

		// width of a float = 32 (4 bytes).
		float myFloatValue = 5f / 3f;

		// width of a double = 64 (8 bytes).
		double myDoubleValue = 5d / 3d;

		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);

		//challenge
		double numPounds = 200d;
		double convertedKilograms = numPounds * 0.45359237d;
		System.out.println("Kilograms = " + convertedKilograms);
	}
}
