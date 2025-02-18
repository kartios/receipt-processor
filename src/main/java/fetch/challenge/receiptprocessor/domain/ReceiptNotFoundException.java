package fetch.challenge.receiptprocessor.domain;

public class ReceiptNotFoundException extends RuntimeException {

    public ReceiptNotFoundException() {
        super("No receipt found for that ID.");
    }
}
