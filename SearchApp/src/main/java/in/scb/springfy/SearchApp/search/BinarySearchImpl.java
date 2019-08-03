package in.scb.springfy.SearchApp.search;


import org.springframework.beans.factory.annotation.Autowired;


import in.scb.springfy.SearchApp.sort.iSort;
//@Component
public class BinarySearchImpl {
	
	

	public BinarySearchImpl(iSort sortingImpl) {
		super();
		this.sortingImpl = sortingImpl;
	}

	//public static final String Bubble_sort= "Bubble";
	//public static final String Quick_sort="Quick";
	@Autowired
	iSort sortingImpl=null;
	
	/*
	public iSort getSortingImpl() {
		return sortingImpl;
	}


	public void setSortingImpl(iSort sortingImpl) {
		this.sortingImpl = sortingImpl;
	}*/


	public boolean  isPresent(int[] sourceNum,int numToSearch)
	{
		System.out.println("Inside BinarySearchImpl");
		sortingImpl.sort(sourceNum);
		
		/*iSort sortImpl =null;
		if(Bubble_sort.equals(sortingImpl)) {
			//System.out.println("Into Bubble Sort");
			//BubbleSort bsort =new BubbleSort();
			//bsort.sort(sourceNum);
			sortImpl = new BubbleSort();
			sortImpl.sort(sourceNum);
			
		}
		else if(Quick_sort.equals(sortingImpl)) {
			//System.out.println("Into Quick Sort");
			//QuickSort qsort=new QuickSort();
			//qsort.sort(sourceNum);
			sortImpl = new QuickSort();
			sortImpl.sort(sourceNum);
		}
		*/
		System.out.println("Binary Search Completed");
		return true;
    }
}