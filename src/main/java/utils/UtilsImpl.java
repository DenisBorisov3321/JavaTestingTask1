package utils;

import exceptions.ComputeFactorialException;
import exceptions.ConcatenateWordsException;

import java.util.List;

public interface UtilsImpl {
    int computeFactorial(int number) throws ComputeFactorialException;
    String concatenateWords(List<String> strings) throws ConcatenateWordsException;
}
