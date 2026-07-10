import java.util.*;

public class total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of pencil :  ");
        float pencil = sc.nextFloat();
        System.out.print("Enter price of pen :  ");
        float pen = sc.nextFloat();
        System.out.print("Enter price of earser :  ");
        float eraser = sc.nextFloat();

        double ogCost = pen + pencil + eraser;
        //with gst calculation 
        double gst = (ogCost * 18) / 100;
        double totalPrice = ogCost + gst;
        System.out.print("The total cost is : " + totalPrice);
        

        sc.close();
    }
}
