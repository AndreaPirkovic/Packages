package pirkovic.andrea;

//import java.util.Scanner;
//import java.util.*;// ukljucuje import svih biblioteka u Java programskom jeziku pa i skenera

public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);// cela putanja do zadate klase umesto importa
		double r,a;
		System.out.println("Unesite poluprecnik:");
		r= sc.nextDouble();
		a= 3.14*r*r;
		
		System.out.println("Povrsina kruga je " + a);
	}

}
