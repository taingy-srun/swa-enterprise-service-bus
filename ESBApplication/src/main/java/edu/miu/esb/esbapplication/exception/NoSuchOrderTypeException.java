package edu.miu.esb.esbapplication.exception;

public class NoSuchOrderTypeException extends Exception {
    NoSuchOrderTypeException() {
        super();
    }

    public NoSuchOrderTypeException(String msg) {
        super(msg);
    }
}
