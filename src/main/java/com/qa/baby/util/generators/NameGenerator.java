package com.qa.baby.util.generators;

import java.util.List;
import java.util.Random;

import com.qa.baby.util.constants.Constants;

public class NameGenerator {
	private List<String> letterArray = Constants.letterArray;
	
	public String nameCreator(int length, String start) { 
		if(length<start.length()) {
			return "The name start must be shorter than the length";
		}else {
			StringBuilder generatedName = new StringBuilder();
			generatedName.append(start);
			while(generatedName.length()<length) {
				generatedName.append(letterArray.get(new Random().nextInt(26)));
			}
			return capitilisation(generatedName.toString());
		}
		
		
	}
	
	public String capitilisation(String completeName) {
		return completeName = completeName.substring(0, 1).toUpperCase() + completeName.substring(1).toLowerCase();
	}
}
