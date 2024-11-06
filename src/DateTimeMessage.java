import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeMessage extends MessageDecorator {

    public DateTimeMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        return addDateTime(message.getText());
    }

    private String addDateTime(String text) {
        String dateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        return "[" + dateTime + "] " + text;
    }
}
