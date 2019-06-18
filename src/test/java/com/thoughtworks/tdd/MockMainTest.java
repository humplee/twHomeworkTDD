package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MockMainTest {
    private MockMain mockMain;
    @Test
    public void should_return_right_number(){
        mockMain=new MockMain();
        assertThat(mockMain.fizzBuzz(1),is("1"));
        assertThat(mockMain.fizzBuzz(3),is("Fizz"));
        assertThat(mockMain.fizzBuzz(5),is("Buzz"));
        assertThat(mockMain.fizzBuzz(7),is("Whizz"));
        assertThat(mockMain.fizzBuzz(15),is("FizzBuzz"));
        assertThat(mockMain.fizzBuzz(21),is("FizzWhizz"));
        assertThat(mockMain.fizzBuzz(35),is("BuzzWhizz"));
        assertThat(mockMain.fizzBuzz(105),is("FizzBuzzWhizz"));
        assertThat(mockMain.fizzBuzz(120),is("FizzBuzz"));
    }
}
