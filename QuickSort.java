
public class QuickSort {
	
	public void sort(int[] numbers) {
		sort(numbers, 0, numbers.length - 1);
		
	}
	public void sort(int[] numbers, int start, int end) {
		if (start < end) {
			int p = partition(numbers, start, end);
			sort(numbers, start, p - 1);
			sort(numbers, p + 1, end);
			
		}
	
	}
	
	private int partition(int[] numbers, int start, int end) {
		int pivot = numbers[end];
		int x = start - 1;
		for(int i = start; i < end; i++ ) {
			if(numbers[i] < pivot) {
				x++;
				swap(numbers,x, i);
			}
			
		}
		swap(numbers, x + 1, end);
		return x + 1;
	}
	
	public void swap(int[] numbers, int x, int y) {
		int temp = numbers[x];
		numbers[x] = numbers[y];
		numbers[y] = temp;
		
	}
}
