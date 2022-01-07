package day4;

import java.util.Arrays;
import java.util.List;

public interface FireType {
	public final String fireAttribute = "FIRE";
	public final List<String> superEffectiveList = Arrays.asList("ICE", "STEEL", "GRASS", "BUG");
	public final List<String> notEffectiveList = Arrays.asList("DRAGON", "WATER", "FIRE", "ROCK");
}
