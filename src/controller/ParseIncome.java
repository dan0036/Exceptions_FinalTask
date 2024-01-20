package controller;

import model.exceptions.DateFormatExceptionCustom;
import model.exceptions.FourFieldsInputException;
import model.exceptions.NullFieldException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ParseIncome {

    public String[] parseIncome(String in) throws NullFieldException, FourFieldsInputException {
        // result возвращает массив с позицями: ФИО, дата р., тел., пол.
        String[] result = new String[6], parse = new String[4];
        parse = in.split(",");

        // Проверка на пустые поля ввода.
        for (String string:parse) { 
            if (string == null) {
                throw new NullFieldException("One of the fields is empty");
            }
        }
        
        // Расфасовка по ячейкам массива в зависимости от типа данных, 
        // с предпроверкой незанятости ячеек.
        for (String i : parse) {
            if ((i.equals("m")||i.equals("f")) && result[5] == null) {
                result[5] = i;
            } else if (parseToIntChek(i) && i.length() == 11 && result[4] == null) {
                result[4] = i;
            } else if (dateFormatCheck(i) && result[3] == null) {
                result[3] = i;
            } else if (NameValidCheck.nameValidCheck(i) && result[2] == null) {
                result = i.split(" ");
            }
        }

        //  Проверка на пустые поля в итоговом массиве.
        for (String string:result) {
            if (string == null) {
                throw  new NullFieldException("There is/are empty fields in input.");
            }
        }

        return result;
    }

    private boolean parseToIntChek (String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean dateFormatCheck (String string) {

        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        try {
            dateFormatter.parse(string);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
