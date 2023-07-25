package ke.co.skwaweru254.Examples;

public class A {
    public static void main(String[] args) {

        int count = add(3);

        System.out.println("Counts:" +count);

    }

    public static int add(int d) {

        if (d > 1) {

            System.out.println(d + add(d - 1));
            System.out.println(d);
            System.out.println(add(d-1));
            return d + add(d - 1);
        } else
            return 0;
    }


}

