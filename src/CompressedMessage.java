public class CompressedMessage extends MessageDecorator {

    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return compress(message.getText());
    }

    private String compress(String text) {
        return text.replaceAll("\\s+", " ");
    }
}
