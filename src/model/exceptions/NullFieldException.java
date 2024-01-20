package model.exceptions;

public class NullFieldException extends NullPointerException {
    public NullFieldException() { super(); }

    public NullFieldException(String s) {
        super(s);
    }
}
