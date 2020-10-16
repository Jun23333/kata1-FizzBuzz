import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzz_ {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_number_when_it_recives_a_non_3_neither_5_multiple() {
        assertEquals("1",fizzBuzz.of(1));
        assertEquals("2",fizzBuzz.of(2));
    }

    @Test
    public void should_return_Fizz_when_it_recives_a_3_multiple() {
        assertEquals("Fizz",fizzBuzz.of(3));
        assertEquals("Fizz",fizzBuzz.of(6));
    }

    @Test
    public void should_return_Fizz_when_it_recives_a_5_multiple() {
        assertEquals("Buzz",fizzBuzz.of(5));
        assertEquals("Buzz",fizzBuzz.of(10));
    }

    @Test
    public void should_return_Fizz_when_it_recives_a_15_multiple() {
        assertEquals("FizzBuzz",fizzBuzz.of(15));
        assertEquals("FizzBuzz",fizzBuzz.of(30));
    }
}
