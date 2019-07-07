import exceptions.ComputeFactorialException;
import exceptions.ConcatenateWordsException;
import utils.Utils;
import utils.UtilsImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UtilsImpl utils = new Utils();

        System.out.println("\nФакториал");
        int number = 5;

        try{
            System.out.println("Факториал числа " + number + ": " + utils.computeFactorial(number));
        } catch (ComputeFactorialException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("\nКонкатенация строк");
        List<String> stringList = Arrays.asList("Hello", ", ", "World!");

        for(String string : stringList){
            System.out.println(string);
        }
        try{
            System.out.println("Объединение строк: " + utils.concatenateWords(stringList));
        }catch (ConcatenateWordsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
