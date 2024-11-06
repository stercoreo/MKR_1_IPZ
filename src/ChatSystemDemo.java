public class ChatSystemDemo {
    public static void main(String[] args) {
        Message message = new SimpleMessage("This is a text message.");

        // Encrypt the message
        message = new EncryptedMessage(message);
        System.out.println("Encrypted: " + message.getText());

        // Add date and time
        message = new DateTimeMessage(message);
        System.out.println("With DateTime: " + message.getText());

        // Compress the message
        message = new CompressedMessage(message);
        System.out.println("Compressed: " + message.getText());

        // Add author's name
        message = new AuthorMessage(message);
        System.out.println("With Author: " + message.getText());
    }
}
