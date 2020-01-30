package com.company.SumIsEqualToGivenNumber;

public class PairsOfElementsInArray {

	public static void findThePairs(int[] arrayValue, int inputNumber)
	{
		System.out.println("Pair of element whose sum is " +inputNumber + ": ");
		for (int i = 0; i < arrayValue.length; i++) {
			for (int j = i+1; j < arrayValue.length; j++) {
				if((arrayValue[i] + arrayValue[j]) == inputNumber)
				{
					System.out.println(arrayValue[i] + "+" + arrayValue[j] + "=" + inputNumber);
				}
			}
			
		}
	}
	public static void main(String[] args) {
		findThePairs(new int[] {4,6,5,8,5,-10,20},10);

	}

}
