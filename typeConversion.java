public class typeConversion {
    public static void main(String[] args) {
        // int x = 100;
        // long y = x;
        // System.out.println(y);

        // long x = 1000;
        // int y = (int) x;    //type casting
        // System.out.println(y);

        long x = 100000000000L;
        int y = (int) x;       // gives a  number as a result after loss as we forced to convert long to int
        System.out.println(y);


    }
}
