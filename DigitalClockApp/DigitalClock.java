import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable {

    private static final long serialVersionUID = 1L;
    private JLabel clockLabel = new JLabel();
    private DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(clockLabel);
        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            LocalTime currentTime = LocalTime.now();
            String formattedTime = currentTime.format(timeFormat);
            clockLabel.setText(formattedTime);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DigitalClock digitalClock = new DigitalClock();
        Thread clockThread = new Thread(digitalClock);
        clockThread.start();
    }

}
