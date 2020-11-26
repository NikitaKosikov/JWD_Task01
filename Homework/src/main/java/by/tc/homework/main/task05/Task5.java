package by.tc.homework.main.task05;

public class Task5 {
    public static boolean isNumberPerfect(int number){
        if (number<6)
            return false;
        int sum = 1;
        for (int i = 2; i < number/2 + 1; i++) {
            if (number%i==0)
                sum+=i;
        }
        return sum==number;
    }
}
