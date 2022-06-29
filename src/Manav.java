import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut= 2.14, elma= 3.67, muz= 0.95, domates= 1.11, patlıcan=5.0;

        Scanner inp= new Scanner(System.in);
        System.out.println(" Kac kilo Armut Istiyorsunuz: ");
        armut= inp.nextDouble() *2.14;
        System.out.println(" Kac kilo Elma  Istiyorsunuz: ");
        elma= inp.nextDouble()*3.67;
        System.out.println(" Kac kilo Domates Istiyorsunuz: ");
        domates= inp.nextDouble() * 1.11;
        System.out.println(" Kac kilo Muz Istiyorsunuz: ");
        muz= inp.nextDouble() *0.95;
        System.out.println(" Kac kilo Patlican Istiyorsunuz: ");
        patlıcan= inp.nextDouble() * 5.0;


        double toplam= (elma + armut +patlıcan +domates+ muz);

        System.out.println("Toplam Tutariniz: " +toplam);



    }
}
