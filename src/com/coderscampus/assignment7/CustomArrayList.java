package com.coderscampus.assignment7;


import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Integer maxSize = 10; //
	int currentSize = 0;
	 
	public Integer getMaxSize(Integer maxSize) {
		return maxSize;
	}
	
	@Override
	public boolean add(T item) {
		if (currentSize ==  maxSize){
			maxSize = maxSize*2;
			Object temp[]= Arrays.copyOf(items, maxSize);
			items = temp;
		}
			for(int i = 0; i < items.length; i++ ) {
				if (items[i] == null) {
					items[i] = item;
					currentSize ++;					
					return true;
				} 
				
			}
		return false;
	}

	@Override
	public int getSize() {
		return currentSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		return (T)items[index];
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		
		if (currentSize ==  maxSize){
			maxSize = maxSize*2;
			Object temp[]= Arrays.copyOf(items, maxSize);
			items = temp;
		}
		
			
			if (index == 0) {
				Object temp[]= Arrays.copyOfRange(items, 0, maxSize-1);
				for(int i=0; i<temp.length; i++) {
					items[i+1] = temp[i];
				}
				items[0]=item;
				currentSize++;
			} else {
	//			Object temp1[] = Arrays.copyOfRange(items, 0, index-1);
				Object temp2[] = Arrays.copyOfRange(items, index, maxSize);
				items[index] = item;
				int index2 = index+1;
				for(int i=index2; i<maxSize; i++ ) {
					items[i] = temp2[i-index2];
				}
				currentSize++;
			}
		
		return true;
		//return false;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		System.out.println("CurrentSize: "+currentSize);
		if (index > currentSize-1) {
			throw new IndexOutOfBoundsException("Sorry, that index is invalid");
		} else {
			if (index == 0) {
				Object temp[]= Arrays.copyOfRange(items, 1, maxSize);
				items=temp;
				currentSize--;
			} else if(index == currentSize) {
				Object temp[] = Arrays.copyOfRange(items, 0, maxSize-1);
				items = temp;
				currentSize--;
			} else {
				Object temp1[] = Arrays.copyOfRange(items, 0, index);
				Object temp2[] = Arrays.copyOfRange(items, index+1, currentSize);
				Object smaller[] = new Object[maxSize];
				for(int i = 0; i<temp1.length; i++) {
					smaller[i]=temp1[i];
				}
				
				for(int i = 0; i < temp2.length; ++i) {
					smaller[temp1.length + i] = temp2[i];
				}
				items=smaller;
				currentSize--;
				
			}
		}
		return null;
	}
	
	
	
}
