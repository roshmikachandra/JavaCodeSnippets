package edu.drexel.cs;

import java.util.ArrayList;

public class CheckPrime {
	//method for prime
		public static boolean IsPrime(int a) {
			boolean flag=true;
			for(int i=2;i<a;i++) {
				if(a%i == 0) {
					flag=false;
				}
			}
			return flag;
		}
		
	//method to print seg of prime numbers
		public static ArrayList<Integer> PrintPrime(int a){
			ArrayList<Integer> list= new ArrayList<Integer>();
			for(int i=2;i<=a;i++) {
				if(IsPrime(i)==true) {
					list.add(i);
					
				}
			}
			return list;
		}	
}
