package ke.co.skwaweru254.Examples;

public class C {
    public static void main(String[] args) {

        int ans = factorial(5);
        System.out.println("Factorial result is "  + ans);


    }

    static int factorial(int y) {
        System.out.println(y+" multiply by factorial of "+(y-1));

        if (y == 1) {

            return 1;
        }

        return y * factorial(y - 1);

    }
}
