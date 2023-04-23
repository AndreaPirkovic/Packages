package p2; // prva instrukcija je uvek naziv paketa

//import p1.First; ovim se importuje samo zadata klasa First iz navedenog paketa p1
//ili
// 
import p1.*;// Ovim se importuje sve iz paketa p1, ne samo klasa First

// da bi smo koristili klasu First iz paketa P1, 
// mora se uraditi import unutar trenutne pokretacke klase

public class Main {

	public static void main(String[] args) {
		
		First f= new First();// Kreiranje klase objakta
		f.view();// poziv funkcije za dati objekat
		

	}

}
