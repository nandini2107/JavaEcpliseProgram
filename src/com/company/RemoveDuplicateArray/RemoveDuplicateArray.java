package com.company.RemoveDuplicateArray;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElement=new ArrayList<String>();
		listWithDuplicateElement.add("Nandini");
		listWithDuplicateElement.add("Shishir");
		listWithDuplicateElement.add("shreelekha");
		listWithDuplicateElement.add("Nandini");
		System.out.println("ArrayList with Duplicate element");
		System.out.println(listWithDuplicateElement);
		HashSet<String> setValue=new HashSet<String>(listWithDuplicateElement);
		ArrayList<String> listWithoutDuplicateElement=new ArrayList<String>(setValue);
		System.out.println("ArrayList without Duplicate element");
		System.out.println(listWithoutDuplicateElement);
		

	}

}
