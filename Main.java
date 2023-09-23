// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Welcome 🙏 to Pappu car service Station.");
        System.out.println("As of now we have services for these 3 cars only \n 1.HetchBack, \n 2.Sedan \n 3.SUV.");
        System.out.println("What type car you have?");
        String carType = cin.nextLine();
        carType = carType.toLowerCase();
        if(carType.equals("hetchback")){
            HatchBack t1 = new HatchBack();
            t1.HatchBackInput();
        }else if(carType.equals("sedan")){
            Sedan t1 = new Sedan();
            t1.SedanInput();
        }else if(carType.equals("suv")){
            Suv t1 = new Suv();
            t1.SUVInput();
        }else {
            System.out.println("As of now we don't have services for this type of car.");
        }
    }
}