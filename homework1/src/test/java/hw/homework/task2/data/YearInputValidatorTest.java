package hw.homework.task2.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class YearInputValidatorTest {

    private String input;
    private Boolean expected;

    public YearInputValidatorTest(String input, Boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> inputValues() {
        return Arrays.asList(new Object[][]{
                {"1342", true},
                {"", false},
                {"-12", false},
                {"2009", true}
        });
    }

    @Test
    public void isValid() {

        boolean actual = new YearInputValidator().isValid(input);

        Assert.assertEquals(expected, actual);
    }
}