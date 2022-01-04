import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ConvertMapToList {
	
	private static Map<String, Double> map = new HashMap<String, Double>();
	
	public static void main(String[] args) {
		double salary = 15000;
		map.put("Jake", (double) 20000);
		map.put("swag", (double) 30000);
		map.put("Dumbass", (double) 10000);
//		List<String> arr = map.values().stream().filter(
//			(x) -> x <= salary
//		);
//		map.keySet().forEach(System.out::println);
		
		List<String> name = map.entrySet().stream().filter(
			e -> e.getValue() <= salary
		).map(Map.Entry::getKey).collect(Collectors.toList());
		
		name.forEach(System.out::println);
	}
}
