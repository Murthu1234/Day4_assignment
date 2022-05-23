package linecomparsion;

public class LengthCalculation {

    public static void main(String[] args) {
        int x1 = 5;
        int x2 = 6;
        int y1 = 3;
        int y2 = 7;

        double length = (Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2)));

        System.out.println("length of line is equal to "+length);
    }
        int x1;
        int y1;
        int x2;
        int y2;
        double length;
}
