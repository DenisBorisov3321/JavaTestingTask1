package utils;

import exceptions.ComputeFactorialException;
import exceptions.ConcatenateWordsException;

import java.util.List;
import java.util.stream.IntStream;

public class Utils implements UtilsImpl{

    @Override
    public int computeFactorial(int number) throws ComputeFactorialException{

        if(number < 0){
            throw new ComputeFactorialException("Число не может быть < 0");
        } else {
            int result = 1;

            int[] numbers = IntStream.range(1, number+1).toArray();

            for(int i : numbers){
                result *= i;
            }
            return result;
        }
    }

    @Override
    public String concatenateWords(List<String> strings) throws ConcatenateWordsException{

        if(strings == null){
            throw new ConcatenateWordsException("Нет строк для объединения");
        } else {
            StringBuilder result = new StringBuilder();

            for(String string : strings){
                result.append(string);
            }

            return result.toString();
        }
    }
}
