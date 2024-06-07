package Projet1.Calculus;

import Projet1.Calculus.affirmation.AffirmationS;
import Projet1.Calculus.affirmation.Mensonge;
import Projet1.Calculus.affirmation.Verite;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
@SpringBootTest
class CalculusApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void louestbeau(){
		Verite verite = new Verite("Lou est beau");
		assertTrue(verite.getValeur());
	}

	@Test
	void louestgenereux(){
		AffirmationS affirmationVraie = new AffirmationS("Lou est généreux", true);
		assertTrue(affirmationVraie.getValeur());
	}

	@Test
	void louestpauvre(){
		Mensonge mensonge = new Mensonge("Lou est pauvre");
		assertFalse(mensonge.getValeur());
	}

}
