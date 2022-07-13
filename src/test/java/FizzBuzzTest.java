import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzzArray fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzzArray();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzArrayFizz() {
        String[] testArray = {"foe"};
        String[] test = fizzBuzz.fizzBuzzArray(testArray);
        assertEquals("Fizz", test[0]);

    }

    @Test
    void fizzBuzzArrayNull() {
        String[] testArray2 = {null};
        String[] test2 = fizzBuzz.fizzBuzzArray(testArray2);
        assertNull(test2[0]);
    }

    @Test
    void fizzBuzzArrayFizzBuzz() {
        String[] testArray3 = {"fob"};
        String[] test3 = fizzBuzz.fizzBuzzArray(testArray3);
        assertEquals("FizzBuzz", test3[0]);
    }

    @Test
    void fizzBuzzArrayBuzz() {
        String[] testArray4 = {"bob"};
        String[] test4 = fizzBuzz.fizzBuzzArray(testArray4);
        assertEquals("Buzz", test4[0]);
    }

    @Test
    void fizzBuzzArray() {
        String[] testArray4 = {"bob", "lob", "fob", "foe", "sam"};
        String[] test4 = fizzBuzz.fizzBuzzArray(testArray4);
        String[] expected = {"Buzz", "Buzz", "FizzBuzz", "Fizz", "sam"};
        assertArrayEquals(expected, test4);
    }
}