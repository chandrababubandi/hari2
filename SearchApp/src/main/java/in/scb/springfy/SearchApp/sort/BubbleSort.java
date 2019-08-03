package in.scb.springfy.SearchApp.sort;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements iSort {

	@Override
	public int [] sort(int[] sourceNum)
	{
		System.out.println("Into Bubble Sort");
		return sourceNum;
	}
}


