package ke.co.skwaweru254;

public class Main {
    public static void main(String[] args) {
        printing();

    }

    static void printing(){
        System.out.println("Printing Method\n");
        writing();
    }

    static void writing(){
        System.out.println("Writing Method\n");
        eating();


    }
    static void eating(){
        System.out.println("Eating Method\n");
        working();


    }
    static void working(){
        System.out.println("Working Method\n");
        adding();


    }
    static void adding(){
        System.out.println("Default Adding Method\n");
        adding(7);


    }
    static void adding(int w){
        System.out.println("Parameterized Adding Method. Value is :"+ w);


    }
}