package programs;

public class LetterBits {
	public static void main(String[] args) {
		//instantiate method
		LetterBits lb = new LetterBits();
		
		//parameters user may change
		int num_additions = 31;
		int loops = 0;
		int max_loops = 41;
		String start = "cja";
		
		//convert string to lower case
		start = start.toLowerCase();
		
		//convert string to an array of characters
		char arrString[] = start.toCharArray(); 
	
		while(loops < max_loops) {
			//call method to increment array
			String final_position = lb.incrementPosition(arrString, num_additions);
			System.out.println("Your starting position: " + start.toUpperCase());
			System.out.println("Your new position: " + final_position.toUpperCase());
			System.out.println();
		
			//set new start to final position and increment by one
			start = final_position;
			arrString = start.toCharArray();
			String new_position = lb.incrementPosition(arrString, 1);
			
			//set start to the incremented position
			start = new_position;
			arrString = start.toCharArray();
			loops++;
		}
	}
	//increment by num var to last letter
		public String incrementPosition(char array[], int num) {
			for(int i = 0; i < num; i++) {
				if (array[array.length - 1] == 'z') {
					int length = resetToA(array, 1);
					//check if zz situation where need to add another element
					if (length != array.length) {
						array = new char[length];
						//set all elements to 'a'
						allAs(array);
					}
				}
				else {
					array[array.length - 1]++;
				}
			}
			//convert char array to string
			String end = new String(array);
			return end;
		}
		
		//sets entire array to 'a'
		public void allAs(char array[]) {
			for (int i = 0; i < array.length; i++) {
				array[i] = 'a';
			}
		}

		//reset the last letter to 'a'
		public int resetToA(char arr[], int count) {
			int index = arr.length - count;
			arr[index] = 'a';
			//checks if first letter has changed from z to a
			if(index == 0) {
				return arr.length + 1;
			}
			if (arr[index - 1] == 'z') {
				count++;
				return resetToA(arr, count);
			}
			else {
				arr[index-1]++;
			}
			return arr.length;
		}
}
