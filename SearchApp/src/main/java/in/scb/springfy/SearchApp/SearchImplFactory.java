package in.scb.springfy.SearchApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.scb.springfy.SearchApp.search.BinarySearchImpl;
import in.scb.springfy.SearchApp.sort.BubbleSort;
import in.scb.springfy.SearchApp.sort.QuickSort;

//@Configuration
public class SearchImplFactory {
	
	@Autowired
	BubbleSort bubbleSort;
	
	@Autowired
	QuickSort quickSort;
	
	@Bean
	public BinarySearchImpl bubbleSortsearchImpl()
	{
		return new BinarySearchImpl(bubbleSort);
	}
	
	@Bean
	public BinarySearchImpl quickSortsearchImpl()
	{
		return new BinarySearchImpl(quickSort);
	}

}
