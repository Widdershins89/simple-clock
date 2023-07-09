import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    private static final SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setLayout(new BorderLayout());

        JLabel timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        frame.add(timeLabel, BorderLayout.CENTER);

        Timer timer = new Timer(1000, e -> {
            String currentTime = TIME_FORMAT.format(new Date());
            timeLabel.setText(currentTime);
        });
        timer.start();

        frame.setVisible(true);
    }
}
