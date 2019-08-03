package in.scb.springfy.SearchApp.search;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {
	
@Autowired
	BinarySearchImpl bubbleSortsearchImpl =null;

@Autowired
	BinarySearchImpl quickSortsearchImpl =null;
	//iSort bubbleSort = new BubbleSort();
	//iSort quickSort = new QuickSort();
	
	/*public void setBubbleSortsearchImpl(BinarySearchImpl bubbleSortsearchImpl) {
		this.bubbleSortsearchImpl = bubbleSortsearchImpl;
	}
	
public void setQuickSortsearchImpl(BinarySearchImpl quickSortsearchImpl) {
		this.quickSortsearchImpl = quickSortsearchImpl;
	}*/
	
	/*public SearchApplication()
	{
		bubbleSortsearchImpl= new BinarySearchImpl();
		bubbleSortsearchImpl.setSortingImpl(new BubbleSort());
		
		quickSortsearchImpl=new BinarySearchImpl();
		quickSortsearchImpl.setSortingImpl(new QuickSort());
	}*/
	
	/*public static void main(String[] args) {
		SearchService searchApp =new SearchService();
		searchApp.search();
	}*/
	 public void search() {
		int[] sourceNumbers = {10,20,30,40};
		performForSortBinary(sourceNumbers);
		performForQuickBinary(sourceNumbers);
	}
		/*BinarySearchImpl searchImpl=new BinarySearchImpl();
		iSort sortingImpl = new BubbleSort();
		searchImpl.setSortingImpl(sortingImpl);
		boolean IsPresent =searchImpl.isPresent(sourceNumbers, 10);
		System.out.println("This is Bubble sort  and the result is :" +IsPresent);
		
		sortingImpl = new QuickSort();
		searchImpl.setSortingImpl(sortingImpl);
		boolean IsPresentForQuick =searchImpl.isPresent(sourceNumbers, 10);
		System.out.println("This is Quick sort  and the result is :" +IsPresentForQuick);
		*/
		private void performForSortBinary(int[] sourceNum)
		{
			//BinarySearchImpl bubbleSortsearchImpl=buildBinarySearchImpl(bubbleSort);
			boolean IsPresent =bubbleSortsearchImpl.isPresent(sourceNum, 1);
			System.out.println("This is Bubble sort  and the result is :" +IsPresent);
		}
		
		private void performForQuickBinary(int[] sourceNum)
		{
			//BinarySearchImpl bubbleSortsearchImpl=buildBinarySearchImpl(new BubbleSort());
			//BinarySearchImpl bubbleSortsearchImpl=buildBinarySearchImpl(quickSort);
			boolean IsPresent =bubbleSortsearchImpl.isPresent(sourceNum, 1);
			System.out.println("This is Quick sort  and the result is :" +IsPresent);
		}
		/*private BinarySearchImpl buildBinarySearchImpl(iSort sort) {
			// TODO Auto-generated method stub
			BinarySearchImpl searchImpl =new BinarySearchImpl();
			searchImpl.setSortingImpl(sort);
			return searchImpl;
		}*/
		
	
}
