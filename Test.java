package Hackerankcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

	

	public static void main(String[] args) {
		
		
		ArrayList  <String> list = new ArrayList<>();
		
		list.add("mac");
		list.add("mac");

		list.add("Dell");
		
		Set<String> s= new HashSet<>();
	
		for (String name :list) {
		//for(int i =0; i < list.size(); i++) {
	         if (s.add(name)==false) //if mac comes i.e. duplicate element comes again it give false and print
	         {
	             System.out.println(name);
	         }
		//System.out.println(arraylist);
		
		
		}
		
	}

	}

