public class IllegalAddressException extends RuntimeException {

    public IllegalAddressException() {
        super();
    }

    public IllegalAddressException(String message) {
        super(message);
    }

    public IllegalAddressException(String message, Throwable throwable) {
        super(message, throwable);
    }
}