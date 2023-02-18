package com.coderscampus.assignment7;




public class ExampleApplication2 {
public static void main(String[] args) {

		
		CustomList<String> newList = new CustomArrayList<>();
		newList.add("01Joshua");
		newList.add("02Matthias");
		newList.add("03Shaung");
		newList.add("04Robert");
		newList.add("05Sandy");
		newList.add("06Jonathon");
		newList.add("07Scout");
		newList.add("08Tiger");
		newList.add("09Keziah");
		newList.add("10Ben");
//		newList.remove(9);
//		newList.remove(9);
//		newList.add("Joshua2");
//		newList.add("Matthias2");
//		newList.add("Shaung2");
//		newList.add("Robert2");
//		newList.add("Sandy2");
//		newList.add("Sandy3");
		
		

		
//		System.out.println("Print list with index 0 removed and note size and that Joshua is gone");
//		newList.remove(0);
		for (int i=0; i<newList.getSize(); i++) {
		    System.out.println(newList.get(i));
		}
//		
		
		
		
	}

}
