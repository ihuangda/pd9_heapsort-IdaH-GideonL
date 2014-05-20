public class Heapsort {
	public static void sort(Integer[] a){
		heapify(a, 0);
		for(int k=0; k<a.length; k++){
			swap(a, 0, a.length - 1 - k);
			swapdown(a, 0, a.length - 1 - k);
		}
	}
	private static void heapify(Integer[] a, int i){
		if(2*i + 1 < a.length)
			heapify(a, 2*i + 1);
		if(2*i + 2 < a.length)
			heapify(a, 2*i + 2);
		swapdown(a, i, a.length);
	}
	private static void swapdown(Integer[] a, int i, int n){
		int j = i;
		if(2*i + 2 < n && a[2*i + 2] >= a[2*i + 1] && a[2*i + 2] > a[i])
			j = 2*i + 2;
		else if(2*i + 1 < n && a[2*i + 1] > a[i])
			j = 2*i + 1;
		swap(a, i, j);
		if(i != j)
			swapdown(a, j, n);
	}
	private static void swap(Integer[] a, int i, int j){
		Integer temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
