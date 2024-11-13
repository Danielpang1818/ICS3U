package day7;

public class Homework {
    public static void main(String[] args) {
        String str = "apple";
        System.out.println(str.indexOf("p"));

        String str2 = "banana";
        int length = (int)((str2.length()+1)/2+0.5);
        String first_half = str2.substring(0,length);
        System.err.println(first_half);

        
    }
    
}
