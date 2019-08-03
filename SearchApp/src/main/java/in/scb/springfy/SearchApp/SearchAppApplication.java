package in.scb.springfy.SearchApp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import in.scb.springfy.SearchApp.search.BinarySearchImpl;
import in.scb.springfy.SearchApp.search.SearchService;
import in.scb.springfy.SearchApp.sort.BubbleSort;
import in.scb.springfy.SearchApp.sort.QuickSort;
import in.scb.springfy.SearchApp.sort.iSort;


@SpringBootApplication
public class SearchAppApplication {

	private static final Logger LOGGER=LoggerFactory.getLogger(SearchAppApplication.class);
	public static void main(String[] args) {

		LOGGER.info("Logger Added Before calling main()");
		ApplicationContext applicationContext = SpringApplication.run(SearchAppApplication.class, args);
		SearchService searchService = applicationContext.getBean(SearchService.class);
		searchService.search();
		LOGGER.info("Logger Added After calling main()");
	}
	
	@Autowired
	@Qualifier("bubbleSort")
	iSort bubbleSortImp;
	
	@Autowired
	iSort quickSort;
	
	/*@Autowired
	BubbleSort bubbleSort;
	
	@Autowired
	QuickSort quickSort;*/
	
	@Bean
	public BinarySearchImpl bubbleSortsearchImpl()
	{
		return new BinarySearchImpl(bubbleSortImp);
	}
	
	@Bean
	public BinarySearchImpl quickSortsearchImpl()
	{
		return new BinarySearchImpl(quickSort);
	}

}


