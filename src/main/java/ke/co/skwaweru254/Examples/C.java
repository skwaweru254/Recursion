package ke.co.skwaweru254.Examples;

public class C {
    public static void main(String[] args) {

        int ans = factorial(5);
        System.out.println("Factorial: " + ans);


    }

    static int factorial(int y) {
        System.out.println("Number: " + y);

        if (y == 1) {

            return 1;
        } else
            return y * factorial(y - 1);

    }
}
