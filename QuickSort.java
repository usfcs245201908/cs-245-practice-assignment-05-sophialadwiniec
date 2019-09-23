public class QuickSort implements SortingAlgorithm{
	public QuickSort(){
		return;
	}

	public void sort(int[] a){
		int begin = 0; 
		int end = a.length-1; 
		quickSort(a,begin,end); 
	}


	public void quickSort(int arr[], int begin, int end) {
    	if (begin < end) {
        	int partitionIndex = partition(arr, begin, end);
 
        	quickSort(arr, begin, partitionIndex-1);
        	quickSort(arr, partitionIndex+1, end);
    	}
	}

	public int partition(int arr[], int begin, int end) {
    	int pivot = arr[end];
    	int i = (begin-1);
 
    	for (int j = begin; j < end; j++) {
        	if (arr[j] <= pivot) {
            	i++;
 
            	int temp = arr[i];
            	arr[i] = arr[j];
            	arr[j] = temp;
        	}
    	}
 
    	int temp = arr[i+1];
    	arr[i+1] = arr[end];
    	arr[end] = temp;
 
    	return i+1;
	}

}