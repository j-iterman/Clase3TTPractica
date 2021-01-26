package sorter;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Time {
    private LocalDateTime start;
    private LocalDateTime stop;

    public void start(){
        /*Calendar calendario = Calendar.getInstance();

        this.start =calendario.get(Calendar.HOUR_OF_DAY);*/

        this.start = LocalDateTime.now();
/*        int hours  = locaDate.getHour();
        int minutes = locaDate.getMinute();
        int seconds = locaDate.getSecond();
        System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds);*/
    }

    public void stop(){
/*        Calendar calendario = Calendar.getInstance();

        this.stop =calendario.get(Calendar.HOUR_OF_DAY);*/

        this.stop = LocalDateTime.now();
    }

    public long elapsedTime(){
        return ChronoUnit.MILLIS.between(start, stop);
    }

/*    public static void main(String[] args) throws InterruptedException {

        Time time = new Time();

        time.start();
        Thread.sleep(5000);
        time.stop();

        System.out.println(time.elapsedTime());

    }*/
}
