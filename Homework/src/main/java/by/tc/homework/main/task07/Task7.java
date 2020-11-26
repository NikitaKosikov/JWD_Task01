package by.tc.homework.main.task07;

public class Task7 {

    public static Point closerToOrigin(Point A, Point B){

        double distancePointA = Math.sqrt(Math.pow(A.getX(), 2) + Math.pow(A.getY() , 2));
        double distancePointB = Math.sqrt(Math.pow(B.getX(), 2) + Math.pow(B.getY() , 2));
        if (distancePointA==distancePointB){
            System.out.println("Two objects are equal");
            return new Point(0,0);
        }
        return  distancePointA < distancePointB?A:B;
    }
}

