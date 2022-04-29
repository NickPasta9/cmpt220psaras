import java.util.*;
public class Problem1 {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter time1 (hour minute second): ");
            int hour = input.nextInt();
            int min = input.nextInt();
            int sec = input.nextInt();
            Time time1 = new Time(hour, min, sec);
            System.out.println(time1.toString());
            System.out.println("Elapsed seconds in time1: "+time1.getSeconds());
            
            System.out.print("Enter time2 (elapsed time): ");
            long time = input.nextInt();
            Time time2 = new Time(time);
            System.out.println(time2.toString());
            
            System.out.println("time1.compareTo(time2)? "+time1.compareTo(time2));
            Time time3 = time1;
            System.out.println("time3 is created as a clone of time1");
            System.out.println("time1.compareTo(time3)? "+time1.compareTo(time3));
        }
    }
}

class Time implements Comparable<Time>{
    private long time;

    public Time() {
        time = System.currentTimeMillis();
    }
    public Time(long time) {
        this.time = time * 1000;
    }
    public Time(int hour, int minute, int second) {
        this.time = (hour * 3600000) + (minute * 60000) + (second * 1000);
    }

    public int getHour() {
        return (int)(time / (1000 * 60 * 60)) % 24;
    }
    public int getMinute() {
        return (int)(time / (1000 * 60)) % 60;
    }
    public int getSecond() {
        return (int)(time / 1000) % 60;
    }
    public long getSeconds() {
        return time / 1000;
    }

    public String toString() {
        String hour = this.getHour() != 1 ? this.getHour()+" hours " : this.getHour()+" hour ";
        String minute = this.getMinute() != 1 ? this.getMinute()+" minutes " : this.getMinute()+" minute ";
        String second = this.getSecond() != 1 ? this.getSecond()+" seconds " : this.getSecond()+" second ";
        return hour+minute+second;
    }
    @Override
    public int compareTo(Time o) {
        return (int) ((this.time / 1000) - (o.time / 1000));
    }
}