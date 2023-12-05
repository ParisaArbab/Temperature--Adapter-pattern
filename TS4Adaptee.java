import java.sql.Time;
import java.sql.Timestamp;
import java.time.DayOfWeek;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
import day.day;
//import month.Month;
public class TS4Adaptee{
    double getTS4Temp;

    double temperatureInC;
    public TS4Adaptee() {
    }
    public double getTS4Temp(Year y, Month m, day d, Time t, String s)
    {
        return getTS4Temp(y,m,d,t,s);
    }
    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }
}

