package com.qa.baby.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.baby.babyapi.util.exceptions.BabyNameBannedException;
import com.qa.baby.babyapi.util.exceptions.BabyNameTooLongException;
import com.qa.baby.persistence.domain.BabyName;
import com.qa.baby.persistence.repository.BabyNameRepository;
import com.qa.baby.util.constants.Constants;
import com.qa.baby.util.generators.NameGenerator;

@Service
public class BabyNameServiceImpl implements BabyNameService {

	@Autowired
	private BabyNameRepository repo;

	@Autowired
	private NameGenerator nameGenerator;

	public String createBabyName(int length, String start) {
		String generatedName = nameGenerator.nameCreator(length, start);
		if(Constants.bannedNames.stream().anyMatch(str -> str.trim().equals(generatedName))==true){
			throw new BabyNameBannedException(generatedName);
		}else if(generatedName.length()>12) {
			throw new BabyNameTooLongException(generatedName.length());
		}else {
			return generatedName;
		}
		
	}

}
