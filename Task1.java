import java.util.*;
import java.util.stream.*;

public class Task1 {
	static String newString = "";
	public static void main(String args[]) {
		String a = "abc";
		String actualresult = "1 2 3";
		
		change(a);
		
		
		
		if(actualresult.equals(newString)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

		

	}
	

	public static void boom(String x) {
		if(Task1.newString.equals(""))
		{
			Task1.newString = x;
		}
		else {
			Task1.newString+= " " + x;
		}
	}

	public static void change(String x) {
		String x2 = x.toUpperCase();
		
		List<String> streamList = x2.chars()

				.mapToObj(c -> (int)c - 64)
				.filter(n -> n>=1 && n <=26)
				.map(c -> c.toString() )
				.collect(Collectors.toList());
				
				

		streamList.stream().forEach(Task1::boom);
		
				
		
		
		

		
		
	
	}
}


