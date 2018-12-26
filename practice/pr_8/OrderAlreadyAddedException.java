public class OrderAlreadyAddedException extends Exception {

    public OrderAlreadyAddedException() {
        super();
    }

    public OrderAlreadyAddedException(String message) {
        super(message);
    }

    public OrderAlreadyAddedException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
