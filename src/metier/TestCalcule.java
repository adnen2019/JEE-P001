package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalcule {
	private ICreditMetier metier ;
	@Before
	public void setUp() throws Exception {
		metier=new CreditMetierImp();
	}

	@Test
	public void testCalculMensu() {
		double cap =200000;
		int duree=240;
		double taux=4.5;
		double resultatAttendu=1265.2987;
		double resultatObtenu=metier.calculMensu(cap, taux, duree);
		assertEquals(resultatAttendu,resultatObtenu,0.0001);
	}

}
