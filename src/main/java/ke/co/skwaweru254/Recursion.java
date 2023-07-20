package ke.co.skwaweru254;

public class Recursion {

    public static void main(String[] args) {

        print(1);

    }

    static void print(int z){

        //Base condition to prevent stackoverflow error

        if (z==100){
            System.out.println(z);
            return;
        }

        System.out.println(z);
        print(z+1);//infinity printing and ca
    }
}
