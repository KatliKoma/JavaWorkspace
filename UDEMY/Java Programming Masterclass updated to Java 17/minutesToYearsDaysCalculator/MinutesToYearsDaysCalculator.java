public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes)
    {
        if(minutes>=0)
        {
            int hours = (int) minutes/60;
            int  day =  hours/24;
            int year= day/365;
            int day2=day-(year*365);
                System.out.println(minutes+" min = "+ year+" y and "+day2+" d");
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }
}