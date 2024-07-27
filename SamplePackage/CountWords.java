package SamplePackage;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) {

		String input = "I am learning java programming java";
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
		String[] inputArray = input.split(" ");
		for (int i = 0; i < inputArray.length; i++) {
			if (!map.containsKey(inputArray[i])) {
				map.put(inputArray[i], count);
			} else {
				map.put(inputArray[i], map.get(inputArray[i]) + 1);
			}
		}

		for (String str : map.keySet()) {
			System.out.println(str + " : " + map.get(str));
		}

	}
}
