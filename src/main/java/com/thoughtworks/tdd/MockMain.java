package com.thoughtworks.tdd;

public class MockMain {
    MockMain(){

    }
    public String fizzBuzz(int count){
        String output="";
        Boolean countReturn = true;
        if(count>0&&count%3==0){output+="Fizz"; countReturn=false;}
        if(count>0&&count%5==0){output+="Buzz";countReturn=false;}
        if(count>0&&count%7==0){output+="Whizz";countReturn=false;}
        if(!countReturn)return output;
        return String.valueOf(count);
    }
}
