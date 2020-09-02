
public class BubbleSort {
	
	public void sort(int[] numbers) {
		for(int i = 1; i < numbers.length; i++ ) {
			for(int j = 0; j < numbers.length - 1; j++ ) {
				if(numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
				
	}
	
	public void swap(int[] numbers, int x, int y) {
		int temp = numbers[x];
		numbers[x] = numbers[y];
		numbers[y] = temp;
		
	}
	// O(n)
	public void sortImprovement1(int[] numbers) {
		for(int i = 1; i < numbers.length; i++ ) {
			for(int j = 0; j < numbers.length - i; j++ ) {
				if(numbers[j] > numbers[j + 1]) {
					swap(numbers, j, j + 1);
				}
			}
		}
	}
	
	// O(n)
	public void sortImprovement2(int[] numbers) {
		int i = 0;
		boolean swapOccured = true;
		while(swapOccured) {
			swapOccured = false;
			i++;
			for(int j = 0; j < numbers.length - i; j++ ) {
				if(numbers[j] > numbers[j + 1]) {
					swap(numbers, j, j + 1);
					swapOccured = true;
				}
			}
		}
	}
	

}
