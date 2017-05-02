import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Auto auto = new Auto();
        auto.setNombre("Dodge Viper");
        auto.setKmxh(170);

        Auto auto1 = new Auto();
        auto1.setNombre("BMW z4");
        auto1.setKmxh(180);

        Auto auto2 = new Auto();
        auto2.setNombre("Audi A8");
        auto2.setKmxh(175);

        Auto auto3 = new Auto();
        auto3.setNombre("Mercedes SLC 350");
        auto3.setKmxh(160);

        Auto auto4 = new Auto();
        auto4.setNombre("Dodge Challenger");
        auto4.setKmxh(190);

        System.out.println("What's your name? men ...");
        String name = scanner.next();

        System.out.println("Elija una pista   ");
        String Pista = scanner.next();

        System.out.println("Elija con que tipo de clima le gustaria correr .... ");
        String Clima = scanner.next();

        System.out.println("Y por ultimo eleji la nave que vas a usar ...   ");
        String Auto = scanner.next();

        int opcionSeleccionada = 0;
        if(opcionSeleccionada==1){
            name.();
            System.out.println();



        System.out.println("Hello World!");
    }
}
