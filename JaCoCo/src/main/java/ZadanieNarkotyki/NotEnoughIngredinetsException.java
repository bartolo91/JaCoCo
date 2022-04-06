package ZadanieNarkotyki;

public class NotEnoughIngredinetsException extends RuntimeException {
    public NotEnoughIngredinetsException() {
    }

    public NotEnoughIngredinetsException(String message) {
        super(message);
    }
}
