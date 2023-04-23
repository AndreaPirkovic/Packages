
public class SamePackage {
	
 SamePackage(){
	 Base b= new Base();
	 System.out.println("Konstruktor klase SamePackage");
	 
	 //System.out.println(" n_pri=:" + b.n_pri);// ovo polje se ne vidi jer mu je pristup private u klasi Base
	 System.out.println(" Same package klasa n_def=:" + b.n_def);
	 System.out.println("Same package klasa n_pro=:" + b.n_pro);
	 System.out.println("Same package klasa n_pub=:" + b.n_pub);
 }
}
