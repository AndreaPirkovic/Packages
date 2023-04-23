package pirkovic.andrea;
//import static java.lang.Math.sqrt;//ako ovako importujemo moze da se koristi samo funkcija Math.sqrt
import static java.lang.Math.*;
public class Main {
 public static void main (String [] args) {

	 double a=3.0, b= 4.0;
	 double c = sqrt(a*a+ b*b);// moze bez Math ispred sqrt jer smo importovali sve matematicke funkcije
	 System.out.println("C=" + c);
 }
}
