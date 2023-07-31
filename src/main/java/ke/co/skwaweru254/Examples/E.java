package ke.co.skwaweru254.Examples;

public class E {

    public static void main(String[] args) {
        System.out.println("It is me again!");

        System.out.println(fibonacci(7));
    }

    static int fibonacci(int count){

        if (count < 2)

            return count;


        return fibonacci(count-1) + fibonacci(count-2);
    }
}
