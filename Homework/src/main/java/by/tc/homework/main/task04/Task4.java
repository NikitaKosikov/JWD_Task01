package by.tc.homework.main.task04;

public class Task4 {

    public static boolean isTwoEvenNumber(int []numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0)
                count++;
        }
        return count>=2;
    }
}
