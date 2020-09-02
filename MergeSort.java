
public class MergeSort {
	private void mergeSort(int[] array, int start, int end) {
		if(start < end) {
			int middle = (end - start)/ 2 + start;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);
			merge(array, start, middle, end);
			
		}
	}
	public void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);
	}
	
	private void merge(int[] array, int start,int middle, int end) {
		int i = start;
		int j = middle + 1;
		int[] tempArr = new int[end - start + 1];
		for(int k = 0; k < tempArr.length ; k++ ) {
			if(i <= middle && (j > end || array[i] <= array[j])) {
				tempArr[k] = array[i];
				i++;
			}
			else {
				tempArr[k] = array[j];
				j++;
			}
		}
		System.arraycopy(tempArr, 0, array, start, tempArr.length);
			
				
	}

}
