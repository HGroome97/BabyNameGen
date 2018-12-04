package com.qa.baby.babyapi.util.exceptions;

public class BabyNameTooLongException extends RuntimeException{

    public BabyNameTooLongException(int exception){
        super("Length must be less than 12. Length: " + exception);
    }

}
