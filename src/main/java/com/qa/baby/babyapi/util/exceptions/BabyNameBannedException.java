package com.qa.baby.babyapi.util.exceptions;

public class BabyNameBannedException extends RuntimeException{

    public BabyNameBannedException(String exception){
        super("Name is on banned list. Name: " + exception);
    }

}
