package com.coderscampus.assignment7;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_at_specific_index_11_names() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		for(int i=0; i<10; i++) {
			sut.add("joshua" + i);
		}
		
		//Act
		sut.add(0, "Carl");


		
		
		//Assert
		assertEquals(11, sut.getSize());
		assertEquals("Carl", sut.get(0));
	}
	
	@Test
	void should_add_item_at_specific_index_21_names() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		for(int i=0; i<20; i++) {
			sut.add("joshua" + i);
		}
		
		//Act
		sut.add(0, "Carl");


		
		
		//Assert
		assertEquals(21, sut.getSize());
		assertEquals("Carl", sut.get(0));
	}
	@Test
	void should_add_item_at_specific_index_middle() {
		//Arrange
		CustomList<String> sut = new CustomArrayList<>();
		for(int i=0; i<10; i++) {
			sut.add("joshua" + i);
		}
		
		//Act
		sut.add(5, "Carl");


		
		
		//Assert
		assertEquals(11, sut.getSize());
		assertEquals("Carl", sut.get(5));
	}
	
	@Test
	void should_remove_item_at_index_0() {
		CustomList<String> sut = new CustomArrayList<>();
		sut.add("Melinda");
		for(int i=0; i<9; i++) {
			sut.add("Joshua" + i);
		}
		
		//Act
		sut.remove(0);


		
		
		//Assert
		assertEquals(9, sut.getSize());
		assertEquals("Joshua0", sut.get(0));
		
		
	}
	
	@Test
	void should_remove_item_at_index_5() {
		CustomList<String> sut = new CustomArrayList<>();
		
		for(int i=0; i<10; i++) {
			sut.add("Joshua" + i);
		}
		
		
		//Act
		sut.remove(5);
		
		
		//Assert
		assertEquals(9, sut.getSize());
		assertEquals("Joshua6", sut.get(5));
		
		
	}
	

}
