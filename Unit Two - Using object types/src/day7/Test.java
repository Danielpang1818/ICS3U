package day7;

public class Test {
    public static void main(String[] args) {
        int b = 6;
        int a= 10;
        int max = a;
        int min = b;

        for (int i = 1; i <= 100; i++) {
            int num = (int)(Math.random()*(a-b+1)+b);
            System.out.println(num);
        }
    }
    
}
