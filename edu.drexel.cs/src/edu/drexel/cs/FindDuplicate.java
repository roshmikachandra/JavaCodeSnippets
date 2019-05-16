package edu.drexel.cs;

import java.util.*;

public class FindDuplicate {
	
	//class member
	private int [] a;
	
	
	//generate getters and setters
	
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	
	//default constructor
	
	public FindDuplicate() {
		
		this.a = null;
	}
	
	
	// parameterized constructor
	
	public FindDuplicate(int[] b) {
		
		this.a = b;
	}
	
	// getting duplicate using for loop
	
	public ArrayList<Integer> getDuplicates(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<a.length-1;i++) {
			for (int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					list.add(a[i]);
				}
			}	
		}
		return list;	
	}
	
	//getting duplicates using HashMap
	
	public ArrayList<Integer> getDuplicateMap(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}else {
				map.put(a[i], 1);
			}
		}
		
		for(Map.Entry me: map.entrySet()) {
			int value= (int) me.getValue();
			if(value==2) {
				list.add((Integer)me.getKey());	
			}
		}
		return list;
	}
	

	

}


