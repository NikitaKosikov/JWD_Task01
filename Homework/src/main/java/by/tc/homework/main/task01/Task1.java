package by.tc.homework.main.task01;

public class Task1 {

    public static int searchLastDigitInSquare(Number number){
        String stringNumber = String.valueOf(number);
        int lastDigit = Integer.parseInt(""+ stringNumber.charAt(stringNumber.length()-1));
        return lastDigit * lastDigit % 10;
    }
}
