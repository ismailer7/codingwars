package ma.fpl.utility;

public class FoldArray {

	public static int[] foldArray(int[] array, int runs) {
		int count = 0;
		
		while(count < runs) {
			
			if(array.length % 2 == 0) {
				int[] left = new int[array.length / 2];
				for (int i = 0; i < array.length / 2; i++){
					left[i] = array[i];
				}
				int[] right = new int[array.length / 2];
				for (int i = array.length / 2, k = 0; i < array.length; i++, k++){
					right[k] = array[i];
				}
				
				int result[] = new int[array.length / 2];
				
				for (int i = 0, j = right.length - 1; i < left.length; i++, j--) {
					result[i] = left[i] + right[j];
				}
				array = result;
				
			} else {
				int middle = array[array.length / 2];
				int[] left = new int[array.length / 2];
				for (int i = 0; i < array.length / 2; i++) {
					left[i] = array[i];
				}
				int[] right = new int[array.length / 2];
				for (int i = array.length / 2 + 1, k = 0; i < array.length; i++, k++){
					right[k] = array[i];
				}
				
				int result[] = new int[array.length / 2 + 1];
				
				for (int i = 0, j = right.length - 1; i < left.length; i++, j--) {
					result[i] = left[i] + right[j];
				}
				result[result.length - 1] = middle;
				array = result;
			}
			count++;
		}
		return array;
	}
	
	
	
}
