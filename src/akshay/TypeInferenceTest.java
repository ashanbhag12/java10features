package akshay;

import java.util.ArrayList;

public class TypeInferenceTest {
	
	public static void main(String[] args) {
		
		var name = "Akshay";
		
		var names = new ArrayList<String>(); 
		names.add(name);
		System.out.println(names);
		
		//var is not a keyword. The following line in legit:
		var var = "var";
		System.out.println(var);
		
		//creates ArrayList<Object>
		var list = new ArrayList<>();
		list.add(new Object());
		System.out.println(list);
		
		//creates ArrayList<String>
		var strList = new ArrayList<String>();
		strList.add(var);
		
		for(var str : strList) {
			System.out.println(str);
		}
		
		
		/*
		 *  var cannot be used in:
		 *  	Method Parameters
		 *  	Return types
		 *  	Instance variables
		 *  	catch blocks
		 *  	initialized with null
		 */
		
	}
	
}
