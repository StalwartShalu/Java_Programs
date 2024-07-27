package SamplePackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "153";
		int a = Integer.parseInt(str);
		System.out.println(a);

		// Integer to String
		System.out.println(Integer.toString(a));

		//String to CharArray
		String str2 = "Hello";
		for(int i =0; i<str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}
		
		
		//CharacterArray to String 
		char[] CharacterArray = {'A', 'B', 'C'};
		System.out.println(String.valueOf(CharacterArray));
		
		
		// String to Date
		String StringtoDate = "09-Jul-2024";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyy");
		try {
			Date date = formatter.parse(StringtoDate);
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// Date to String
		LocalDate now = LocalDate.now();
		System.out.println(now.toString());

	}

}
