import java.sql.Date;
        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Scanner;
public class Main{
    static java.util.Date dateobj;
    private static Scanner keyboard;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float C = in.nextFloat();
        float F = C * (9f / 5) + 32;
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
                DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");


        Date dateobj = new Date (03, 21, 20);
        System.out.println(df.format(dateobj));
        System.out.println("Welcome to the temperature calculator\n");

        //Prompting user for the temperature each day
        System.out.println("Please enter TS1 temperature. ");
        double TS1 = keyboard.nextDouble();

        System.out.println("Please enter TS2 temperature. ");
        double TS2 = keyboard.nextDouble();

        System.out.println("Please enter TS3 temperature. ");
        double TS3 = keyboard.nextDouble();
    }
    public static void dailyAverageTemp()
    {
        int day;

        System.out.println("\nTo see the average daily temperature, please enter the number " +
                "for the day of the week you wish to view.");

        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday\n");
        day = keyboard.nextInt();

        static DateFormat df = new DecimalFormat("00.00");
        switch (day)
        {

            case 1: System.out.println("Monday's average temperature was "+
                    (df.format(monTemp))+"C");
                break;
            case 2: System.out.println("Tuesday's average temperature was "+
                    (df.format(tueTemp))+"C");
                break;
            case 3: System.out.println("Wednesday's average temperature was "+
                    (df.format(wedTemp))+"C");
                break;
            case 4: System.out.println("Thursday's average temperature was "+
                    (df.format(thurTemp))+"C");
                break;
            case 5: System.out.println("Friday's average temperature was "+
                    (df.format(friTemp))+"C");
                break;
            case 6: System.out.println("Saturday's average temperature was "+
                    (df.format(satTemp))+"C");
                break;
            case 7: System.out.println("Sunday's average temperature was "+
                    (df.format(sunTemp))+"C");

        }//switch
    }
    public static void calculatingAverageWeeklyTemp()
    {
        String sumOfTemps;
        double averageWeeklyTemp;
        //Adding all the temperatures for each day together.
        sumOfTemps = monTemp+tueTemp+wedTemp+thurTemp+friTemp+satTemp+sunTemp;
        //Dividing the sum of all temperatures by 7 to find the average weekly temp.
        averageWeeklyTemp = sumOfTemps/7;
        System. out.println("\nThe average weekly temperature was "+(df.format(averageWeeklyTemp)) +"C");
    }//calculatingAverages
}