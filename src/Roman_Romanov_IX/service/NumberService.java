package Roman_Romanov_IX.service;

import java.beans.IntrospectionException;

public class NumberService {

    public int getSumByDivision(int number) {
        int result = 0;
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    public int getSumByTypeConversion(int number) {
        int result= 0;
        String numberAsString = String.valueOf(number);
        char[] symbols=numberAsString.toCharArray();

         for (int i = 0; i <symbols.length ; i++) {
            result += symbols[i]-48;
        }

        System.out.println(result);
        return result;

//        for (char symbol:symbols) {
//            result += symbol;
//        }
//
//        int  i = 0;
//        while (i < symbols.length ){
//            result += symbols[i];
//            i++;
//        }
//
//        i = 0;
//        do {
//            result += symbols[i];
//            i++;
//        }while (i < symbols.length)

    }
}
