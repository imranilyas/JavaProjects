package day4;

import java.util.Arrays;
import java.util.List;

public interface DarkType {
	public final String fireAttribute = "DARK";
	public final List<String> superEffectiveList = Arrays.asList("GHOST", "PSYCHIC");
	public final List<String> notEffectiveList = Arrays.asList("FIGHTING", "DARK", "FAIRY");

}
