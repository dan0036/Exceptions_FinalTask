package model.exceptions;

public class FourFieldsInputException extends Exception {
    public FourFieldsInputException() { super(); }

    public FourFieldsInputException(String message) {
        super(message);
    }
}
