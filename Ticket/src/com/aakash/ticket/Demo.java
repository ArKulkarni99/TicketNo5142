package com.aakash.ticket;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		Set<Languages> set = new HashSet<Languages>();
		
		set.add(new Languages(101, "ar", "Arabic", "UAE"));
		set.add(new Languages(102, "az", "Azerbaijani", "Azerbaijan"));
		set.add(new Languages(103, "my", "Burmese", "Myanmar"));
		set.add(new Languages(104, "zh", "Chinese", "China"));
		set.add(new Languages(105, "mr", "Marathi", "India"));
		
		System.out.println(set);
		
		Map<Integer, String> lan1 = new HashMap<Integer, String>();
		
		for(Languages l: set) {
			lan1.put(l.getId(),l.getLanguageCode());
		}
		
		System.out.println(lan1);
		
		Map<String, String> lan2 = new HashMap<String, String>();
		
		for(Languages l: set) {
			lan2.put(l.getLanguageCode(), l.getLanguageName());
		}
		
		System.out.println(lan2);
	}

}
