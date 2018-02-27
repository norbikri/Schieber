package tiere;

public class TestTiere {
	/*#tiere.Saeugetier lnkSaeugetier*/
public static void main (String [] strs) {
		Saeugetier s= new Affe("cita"), 
				s1 = new Hund("belo");
		System.out.println("ich heisse "+ s.wieHeisstDu());
		s.rede();
		System.out.println("ich heisse "+ s1.wieHeisstDu());
		s1.rede();
		
	}
}
