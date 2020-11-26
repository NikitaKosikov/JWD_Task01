package by.tc.homework.main.task10;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task10 {

    public static  Map<Double, Double>  functionValueOnSegment(double a, double b, double h){
        Map<Double, Double> countValue = new LinkedHashMap<>();
        while (a<=b && h!=0){
            countValue.put(a, Math.tan(a));
            a+=h;
        }
        return countValue;
    }

    public static void printTable(Map<Double, Double> actual, double x, double h){
        System.out.println("\tx\t |\t F(x)");
        for (int i = 0; i < actual.size(); x+=h, i++) {
            System.out.println("___________________");
            System.out.printf("%f | %f\n", x, actual.get(x));
        }
        System.out.println("___________________\n\n");
    }
}
