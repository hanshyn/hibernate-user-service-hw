package mate.academy.exception;

public class RegistrationException extends RuntimeException {
    public RegistrationException(String massage) {
        super(massage);
    }
}