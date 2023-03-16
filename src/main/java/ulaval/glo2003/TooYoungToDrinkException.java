package ulaval.glo2003;

public class TooYoungToDrinkException extends NotPermittedException {
    public TooYoungToDrinkException(String name) {
        super(String.format("Sorry %s, you are too young to drink.", name));
    }
}
