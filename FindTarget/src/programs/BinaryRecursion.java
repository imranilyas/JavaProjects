package programs;
import java.util.Arrays;

public class BinaryRecursion {
	public static void main(String[] args) {
		//Algorithm:
			//fill random array with random generator --check
			//sort array from least to greatest --check
			//find target among the array --check
			//find first appearance before the index it is caught at --check
		
		int bit = 8;
		BinaryRecursion br = new BinaryRecursion();
		int random[] = new int[bit];
		//arrays naturally pass-by-reference
		
		//fill array w/ random numbers
		br.randomGen(random);
		
		//sort array
		Arrays.sort(random);
		System.out.println(Arrays.toString(random));

		//create random target
		double temp = Math.random()*10;
		int target = (int)temp;
		System.out.println("Target: " + target);
		
		//match target to element in array
		int min = 0;
		int midpoint = random.length / 2;
		int match = br.binarySearch(target, midpoint, min, random);
		System.out.println("Index: " + match);				

		
		//test if it catches the first target with multiple target appearances
		System.out.println();
		System.out.println("Example Array");
		int test[] = {1, 2, 5, 5, 5, 5, 5, 8};
		int targ = 5;
		System.out.println(Arrays.toString(test));
		System.out.println("Target: " + targ);
		int test_match = br.binarySearch(targ, midpoint, min, test);
		System.out.println("Index: " + test_match);
			
	}
	
	//random generator method
	public void randomGen(int empty[]) {
		for (int i = 0; i < empty.length; i++) {
			double temp = Math.random() * 10;
			empty[i] = (int)temp;
		}
	}
	
	//match first appearance of target (integer) in array
	public int binarySearch(int target, int midpoint, int min, int sorted[]) {
		if (sorted == null) {
			return -1;
		}
		if (target == sorted[0]) {
			return 0;
		}
		//check if target matches midpoint
		if (target == sorted[midpoint]) {
			int count = countInt(target, midpoint, sorted);
			return midpoint - count;
		}
		if(target > sorted[midpoint]) {
			int difference = (sorted.length - midpoint)/2;
			if (difference == 0) {
				return -1;
			}
			min = midpoint;
			midpoint += difference;
			return binarySearch(target, midpoint, min, sorted);
		}	
		else {
			int difference = (midpoint - min)/2;
			if (difference == 0) {
				return -1;
			}
			midpoint -= difference;
			return binarySearch(target, midpoint, min, sorted);		
		}
	}
	
	//count number of times target appears before an index
	public int countInt(int target, int max, int arr[]) {
		int count = 0;
		//exclude itself because it will match
		for (int i = 0; i < max; i++) {
			if (target == arr[i]) {
				count++;
			}
		}
		return count;
	}
}
