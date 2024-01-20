package controller;

import model.exceptions.FourFieldsInputException;

public class FirstValidCheck {
     public static boolean firstValidCheck (String in) throws FourFieldsInputException {
         int commasNum = 0;
         for (int i = 0; i < in.length(); i++) {
             if (in.charAt(i) == ',') {
                 commasNum++;
             }
         }
         if (commasNum != 3) {
             throw new FourFieldsInputException();
         }
        return true;
    }
}
