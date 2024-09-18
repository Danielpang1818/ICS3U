package day3;

public class ExampleFour {
    public static void main(String[] args) {
        int mark1 = 87, mark2 = 97, mark3 = 63;
        int numMarks = 3;

        // explicit cast on nummarks to convert to a double temporaily
        double average = (mark1 + mark2 + mark3) / (double)numMarks;

        System.err.println(average);
    }
    
}
