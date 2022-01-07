package day4;

public class ArrayFunctions {
	public static void main(String[] args) {
		int arr1[] = {1, 3, 6, 8};
		int min = arr1[0];
		int max = arr1[0];
		int sum = 0;
		for(int i : arr1) {
			sum += i;
			if(min > i) {
				min = i;
			}
			if(max < i) {
				max = i;
			}
		}
		System.out.println("Sum: " + sum + ", Min: " + min + ", Max: " + max);
		
		int arr2[][] = {{1,2}, {100, 6}, {3453, 5465}, {6543, 8764532}};
		for(int i[] : arr2) {
			int sum2d = 0;
			for(int j : i) {
				sum2d += j; 
			}
			System.out.println(sum2d);
		}
	}
}
