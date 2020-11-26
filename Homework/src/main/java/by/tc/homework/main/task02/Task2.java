package by.tc.homework.main.task02;

public class Task2 {

    public static int daysOfMonth(int year, int month){
        if (month<0||month>12 || year < 0){
            return 0;
        }
        int daysOfFebruary = 28;
        if (isLeapYear(year))
            daysOfFebruary++;
        int[] months = {31, daysOfFebruary, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return months[month-1];
    }

    public static boolean isLeapYear(int year){
        if (year<0)
            return false;
        return year%400==0?true:year%100==0?false:year%4==0?true:false;
    }
}