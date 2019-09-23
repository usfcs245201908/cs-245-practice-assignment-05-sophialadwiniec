public class InsertionSort implements SortingAlgorithm{
	public InsertionSort(){
		return;
	}

	public void sort(int[] a){
		int j; 
		int temp; 
		for(int i = 1; i < a.length; i++){
			temp = a[i]; 
			j = i-1; 

			while(j>=0 && a[j]>temp){
				a[j+1] = a[j]; 
				j--; 
			}
			a[j+1] = temp; 
		}
	}

}