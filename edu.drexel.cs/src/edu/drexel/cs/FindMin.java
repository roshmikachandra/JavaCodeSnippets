package edu.drexel.cs;

public class FindMin {
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
		public FindMin() {
				
				this.a = null;
			}

		//Parameterized constructor
		public FindMin(int[] b) {
			
			this.a = b;
		}
		
		public int GetMin() {
			int min=a[0];
			for(int i=0;i<a.length;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			}
			return min;		
		}
		

}
