public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return encrypt(message.getText());
    }

    private String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}
