package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class FirstCollections {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(8766);
		arrList.add(654);
		arrList.add(98765430);
		
		for(int i : arrList) {
			System.out.println("ArrayList: " + i);
		}

		System.out.println("-----------------------------");
		
		Collections.sort(arrList);
		for(int i : arrList) {
			System.out.println("Sorted ArrayList: " + i);
		}
		
		System.out.println("-----------------------------");
		
		LinkedList<String> linked = new LinkedList<>();
		linked.add("2Chainz");
		linked.add("Kanye");
		linked.add("Wu Tang");
		
		for(String i : linked) {
			System.out.println("LinkedList: " + i);
		}
		
		System.out.println("-----------------------------");
		
		linked.addFirst("Slim Shady");
		linked.addLast("sixnine");
		
		for(String i : linked) {
			System.out.println("LinkedList: " + i);
		}
		
		// Sorts numbers > capitals > lowercase
		Collections.sort(linked);

		System.out.println("-----------------------------");
		
		for(String i : linked) {
			System.out.println("LinkedList: " + i);
		}
		
		System.out.println("-----------------------------");
		
		HashSet<String> hash = new HashSet<>();
		hash.add("In the End");
		hash.add("Breaking the Habit");
		hash.add("Somewhere I Belong");
		System.out.println(hash.size());
		System.out.println(hash.toString());
		System.out.println(hash);
		boolean doesExist = hash.contains("In the End");
		boolean doesntExist = hash.contains("What I've Done");
		System.out.println("In the End: " + doesExist);
		System.out.println("What I've Done: " + doesntExist);
		
		HashSet<String> hash2 = new HashSet<>(
				Arrays.asList("In the End", "What I've Done", "Faint", "Somewhere I Belong")		
		);
		hash.removeAll(hash2);
		System.out.println("Modified HashSet: " + hash);
		hash2.clear();
		System.out.println("Cleared HashSet: " + hash2);
		
		System.out.println("-----------------------------");
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Godzilla");
		tree.add("Rodan");
		tree.add("Gigan");
		tree.add("Angirus");
		tree.add("Destroya");
		tree.add("Mecha Godzilla 2");
		// Automatically sorts values
		System.out.println(tree);
		
		System.out.println("First in TreeSet: " + tree.first());
		System.out.println("Last in TreeSet: " + tree.last());
		
		String kaiju = "King Kong";
		System.out.println("Higher in TreeSet: " + tree.higher(kaiju));
		System.out.println("Lower in TreeSet: " + tree.lower(kaiju));
		
		System.out.println("-----------------------------");
		
		Kaiju monster = new Kaiju(1, "Orga", 120);
		Kaiju monster2 = new Kaiju(2, "Space Godzilla", 90);
		Kaiju monster3 = new Kaiju(3, "Jet Jaguar", 60);
		Kaiju monster4 = new Kaiju(4, "Mothra", 50);
		
		ArrayList<Kaiju> monsterList = new ArrayList<>();
		monsterList.add(monster);
		monsterList.add(monster2);
		monsterList.add(monster3);
		monsterList.add(monster4);
		
//		Collections.sort(monsterList);
		for(Kaiju k : monsterList) {
			System.out.println(k.getName());
		}

	}
}
