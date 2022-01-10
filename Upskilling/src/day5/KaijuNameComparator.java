package day5;

import java.util.Comparator;

public class KaijuNameComparator implements Comparator<Kaiju>{

	@Override
	public int compare(Kaiju k1, Kaiju k2) {
		return k1.getName().compareTo(k2.getName());
	}
	
}
