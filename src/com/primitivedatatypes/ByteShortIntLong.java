package com.primitivedatatypes;

public class ByteShortIntLong {

	public static void main(String[] args) {
		//good job
		byte myByteValue = 10;
		System.out.println(myByteValue);
		
		short myShortValue = 20;
		System.out.println(myShortValue);
		
		int myIntValue = 50;
		System.out.println(myIntValue);

		double myByteValue =35.5;
		System.out.println (myByteValue);
		
		long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
		short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));
		System.out.println("longTotal = " + longTotal);
		System.out.println("shortTotal = " + shortTotal);
	}
}