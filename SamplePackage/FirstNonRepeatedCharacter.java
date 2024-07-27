package SamplePackage;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String str = "NonCytoChemistry";
		char[] charArray = str.toLowerCase().toCharArray();
		int count =1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i = 0 ; i<charArray.length; i++) {
			if(! map.containsKey(charArray[i])) {
				map.put(charArray[i], count);
			}
			else {
				map.put(charArray[i], map.get(charArray[i])+1);
			}
		}
		
		for(Character ch: map.keySet()) {
			if(map.get(ch)==1)  {
				System.out.println("First Non Repeated Character is: " + ch);
				break;
			}
		}
	}

}



