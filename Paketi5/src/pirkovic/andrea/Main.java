package pirkovic.andrea;

import static java.lang.Math.PI;
// ili 
//import static java.lang.Math.*;
// static znaci da mozemo pozivati vrednost 3.14 preko oznake PI
public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);// cela putanja do zadate klase umesto importa
		double r,a;
		System.out.println("Unesite poluprecnik:");
		r= sc.nextDouble();
		a= PI*r*r;
		
		System.out.println("Povrsina kruga je " + a);
	}

}