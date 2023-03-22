package org.example.Exceptions;

public class invalidInsert extends Exception{
    public invalidInsert(String message){
        super(message);
        message="The quantity entered is not accepted for this product";
    }
}
