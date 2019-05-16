package edu.drexel.cs;

public class SwapNos {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public SwapNos() {
		this.a = 0;
		this.b = 0;
	}
	public SwapNos(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void DoSwapTemp() {
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a: " + a+ " and b:" +b);
	}
	
	public void DoSwap() {
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping a is: "+a+" and b is: "+b);
	}
	

}
