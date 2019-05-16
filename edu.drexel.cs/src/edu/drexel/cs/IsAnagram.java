package edu.drexel.cs;

import java.util.HashMap;

public class IsAnagram {
	//class members
	private String a;
	private String b;
	
	//generate getters and setters
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	//default constructor
	public IsAnagram() {
		
		this.a = null;
		this.b = null;
	}
	//parameterized constructor
	public IsAnagram(String c, String d) {
		
		this.a = c;
		this.b = d;
	}
	
	
	//method for anagram
	public boolean IsGivenAnagram() {
		boolean flag=false;
		HashMap<Character, Integer> map1=new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2=new HashMap<Character, Integer>();
		char[]c1=a.toCharArray();
		char[]c2= b.toCharArray();
		
		for(char c:c1) {
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}else {
				map1.put(c, 1);
			}
			
		}
		
		for(char c:c2) {
			if(map2.containsKey(c)) {
				map2.put(c, map2.get(c)+1);
			}else {
				map2.put(c, 1);
			}	
		}
		
		if(map1.equals(map2)) {
			flag=true;
		}
		return flag;
		
	}
	
	
	
	

}
