package com.company.SubArrayInArray;

public class SubArrayWhoseSumIsNumber {
	public static void findSubArray(int[] arrayValue, int inputNumber)
	{
		for (int i = 0; i < arrayValue.length; i++) {
			if((arrayValue[i] +arrayValue[i+1] + arrayValue[i+2])== inputNumber)
			{
				System.out.println(arrayValue[i] + "+" + arrayValue[i+1] + "+" + arrayValue[i+2] + "=" + inputNumber);
				System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		
		findSubArray(new int[] {15, 51, 7, 81, 5, 11, 25},41);
	}

}
