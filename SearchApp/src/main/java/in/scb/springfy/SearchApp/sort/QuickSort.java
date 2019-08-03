package in.scb.springfy.SearchApp.sort;


import org.springframework.stereotype.Component;

@Component

public class QuickSort implements iSort {
	@Override
	
	public int [] sort(int[] sourceNum)
	{
		System.out.println("Into Quick Sort");
		return sourceNum;
	}
}
