package edu.drexel.cs;
import edu.drexel.cs.FindDuplicate;

public class TestCode {

	public static void main(String[] args) {
		int []c= {2,-3,2,4,51,6,5,1};
		FindDuplicate testDuplicate = new FindDuplicate(c);
		FindMax testMax = new FindMax(c);
		FindMin testMin= new FindMin(c);
		SwapNos testSwap= new SwapNos(1,2);
		IsAnagram testAnagram= new IsAnagram("silent","listens");
		System.out.println(testDuplicate.getDuplicates());
		System.out.println(testMax.GetMax());
		System.out.println(testMin.GetMin());
		System.out.println(testAnagram.IsGivenAnagram());
		System.out.println(CheckPrime.IsPrime(5));
		System.out.println(CheckPrime.PrintPrime(100));
		testSwap.DoSwapTemp();
		testSwap.DoSwap();
		
		

	}

}
