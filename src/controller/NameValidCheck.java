package controller;

import model.exceptions.FourFieldsInputException;

public class NameValidCheck {
    public static boolean nameValidCheck (String in) throws FourFieldsInputException {
        int spaceNum = 0;
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == ' ') {
                spaceNum++;
            }
        }
        if (spaceNum != 1 && spaceNum != 2) {
            throw new FourFieldsInputException("Full name requirements are not fulfilled.");
        }
        return true;
    }
}
