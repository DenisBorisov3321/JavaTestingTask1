package utils;

import exceptions.ComputeFactorialException;
import exceptions.ConcatenateWordsException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UtilsTest {

    private UtilsImpl utils = new Utils();

    private List<String> inputStrings = new ArrayList<>();
    private int testNumber = 4;

    @Before
    public void setUpStringsForTesting(){
        inputStrings.add("one");
        inputStrings.add("two");
        inputStrings.add("345");
    }

    @Test
    public void concatenateWords_NOT_NULL() {
        try{
            String expected = utils.concatenateWords(inputStrings);
            Assert.assertNotNull(expected);
        }catch (ConcatenateWordsException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void concatenateWords_EMPTY_STRING(){
        try{
            String expected = utils.concatenateWords(inputStrings);
            Assert.assertFalse(expected.isEmpty());
        }catch (ConcatenateWordsException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void concatenateWords_NON_LATIN(){
        try{
            String expected = utils.concatenateWords(inputStrings);
            Assert.assertTrue(expected.matches("[ \\w]+"));
        }catch (ConcatenateWordsException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Test
    public void testComputeFactorial(){
        try{
            int expected = 1;
            //специально такая плохая функция, чтоб отличалось от метода в utils
            for(int i = 1; i <= testNumber; i++){
                expected *= i;
            }
            int current = utils.computeFactorial(testNumber);
            Assert.assertEquals(expected, current);
        }catch (ComputeFactorialException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Ignore
    @Test(timeout = 200)
    public void testFactorialWithTimeout(){
        try{
            int randomNumber = (int)(Math.random()*100);
            int expected = utils.computeFactorial(randomNumber);
        }catch (ComputeFactorialException ex){
            System.out.println(ex.getMessage());
        }
    }
}