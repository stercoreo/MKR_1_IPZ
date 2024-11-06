public class AuthorMessage extends MessageDecorator {

    public AuthorMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return addAuthor(message.getText());
    }

    private String addAuthor(String text) {
        String author = "Tsyhanenko Hryhorii";
        return text + " (Author: " + author + ")";
    }
}
