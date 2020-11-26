package by.tc.homework.main.task06;

public class Task6 {

    public static int[] countTime(long second){
        if (second<0 || second > 86400){
            System.out.println("Invalid input");
            return new int[]{};
        }
        int hours = (int) second / 3600;
        int minutes = (int) (second - hours * 3600) / 60;
        int seconds = (int) (second - hours * 3600 - minutes * 60);
        int[] time = {hours, minutes, seconds};
        return time;
    }
}
