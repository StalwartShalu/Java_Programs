package SamplePackage;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String str = "HelloWorld";
		char[] charArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		int count = 1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], count);
			} else {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			}
		}
		for (Character output : map.keySet()) {
			if(map.get(output)>1 ) {
			System.out.println(output + " : " + map.get(output));
			}  
		}

	}

}
