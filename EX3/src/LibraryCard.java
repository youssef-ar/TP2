public class LibraryCard {
    private int cardNumber;
    private String cardholderName;
    private int maxBooks;
    private int expirationYear;

    public LibraryCard(Person cardholder, int cardNumber, int expirationYear) {
        this.cardNumber = cardNumber;
        this.cardholderName = cardholder.getName();
        this.maxBooks = (cardholder instanceof Student) ? 4 : 6;
        this.expirationYear = expirationYear;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public int getMaxBooks() {
        return maxBooks;
    }

    public int getExpirationYear() {
        return expirationYear;
    }
}