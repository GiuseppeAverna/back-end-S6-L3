package Esercizio.S6L3.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("elemento con id " + id + " non trovato");
    }

    public NotFoundException(String message) {
        super(message);
    }
}