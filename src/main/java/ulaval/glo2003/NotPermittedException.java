package ulaval.glo2003;

public abstract class NotPermittedException extends RuntimeException {
    public NotPermittedException(String message) {
        super(message);
    }
}
