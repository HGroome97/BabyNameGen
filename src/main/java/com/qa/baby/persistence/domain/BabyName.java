package com.qa.baby.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BabyName {
	
	@GeneratedValue
	@Id
	private long babyNameId;
	
	private String babyName;
	
	public BabyName() {}
	
	public BabyName(String babyName) {
		this.babyName = babyName;
	}
	
	public BabyName(long babyNameId, String babyName) {
		this.babyNameId = babyNameId;
		this.babyName = babyName;
	}
	
	public long getBabyNameId() {
		return babyNameId;
	}

	public String getBabyName() {
		return babyName;
	}

	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
}
