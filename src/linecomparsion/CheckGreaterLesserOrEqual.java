package linecomparsion;

public class CheckGreaterLesserOrEqual {

    public static void main(String[] args) {
        int x1 = 3, x2 = 4, x3 = 7, x4 = 6;
        int y1 = 3, y2 = 5, y3 = 4, y4 = 0;

        double len1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double len2 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));

        System.out.println("length1 = "+ len1);
        System.out.println("length2 = "+ len2);
        if (len1 == len2) {
            System.out.println("Two lines are equal");
        } else if (len1 > len2) {
            System.out.println("First line length is Greater than second line length");

        }else{
            System.out.println("First line length is Less than second line length");
        }
    }
}

