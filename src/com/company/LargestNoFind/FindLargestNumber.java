package com.company.LargestNoFind;

public class FindLargestNumber {
	public int getLLessThanN(int number , int digit)
	{
		char c= Integer.toString(digit).charAt(0);
		for (int i = number; i >0; i--) {
			if(Integer.toString(i).indexOf(c)== -1)
			{
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		FindLargestNumber obj=new FindLargestNumber();
		System.out.println(obj.getLLessThanN(123, 2));

	}

}
