package com.company.ArrayProgram;

import java.util.Arrays;

public class ArrayCreation {
	public int[] insertArray(int arraySize, int[] arrayValue ,int x,int pos )
	{
		int[] newarr=new int[arraySize+1];
		for (int i = 0; i < newarr.length; i++) {
			if(i<pos-1)
			{
				newarr[i]=arrayValue[i];
			}
			else if(i== pos-1)
			{
				newarr[i]=x;
			}
			else
			{
				newarr[i]=arrayValue[i-1];
			}
		}

		return newarr;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize=10;
		int[] arrayValue= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("array is :" + Arrays.toString(arrayValue));

		int x=50; // insert element

		int pos=5; //position 
		ArrayCreation obj=new ArrayCreation();
		arrayValue=obj.insertArray(arraySize,arrayValue,x,pos);
		System.out.println("\nArray with " + x + " inserted at position "+ pos + ":\n"+ Arrays.toString(arrayValue));
	}

}
