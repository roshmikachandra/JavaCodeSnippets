package edu.drexel.cs;

public class FindMax {
	//class members
	private int[]a;
	
	
	//getters and setters
	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}
	
	//default constructor
	
		public FindMax() {
			
			this.a = null;
		}

	//Parameterized constructor
	public FindMax(int[] b) {
		
		this.a = b;
	}
	
	//method for max
	public int GetMax() {
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;		
	}
	
	
	
	
	
	

}
