import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class CommandLineClock {
    public static void main(String[] args) throws InterruptedException {

            while (true) {
                LocalDateTime now = LocalDateTime.now();
                String hourString = Integer.toString(now.getHour());
                String minuteString = Integer.toString(now.getMinute());
                String secondString = Integer.toString(now.getSecond());

            String hour = paddedTime(hourString);
                String minute = (paddedTime(minuteString));
                String second = (paddedTime(secondString));

                System.out.println(hour + ":" + minute + ":" + second);
                TimeUnit.SECONDS.sleep(1);
            }
    }

    public static String paddedTime(String time) {
        String paddedZero = "0";
        String paddedString = paddedZero + time;
        String answer;

        if (time.length() <= 1) {
            answer = paddedString;
        }  else {
            answer = time;
        }
        return  answer;
    }
}
