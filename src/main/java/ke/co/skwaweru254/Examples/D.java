package ke.co.skwaweru254.Examples;

public class D {
    static int n0=0,n1=1,n2=1;
    static void fibonacci(int count){
        if(count>0){
            n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            System.out.print(" "+n2);

            fibonacci(count-1);
        }
    }

    public static void main(String[] args) {
        int count=7;
        System.out.print(n0+" "+n1);//printing 0 and 1
        fibonacci(count-1);//n-2 because 2 numbers are already printed
    }
}
