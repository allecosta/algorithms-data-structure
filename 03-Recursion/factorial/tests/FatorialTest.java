package tests;

import org.junit.Assert;
import org.junit.Test;

import tests.Fatorial;
 
public class FatorialTest {
	
	@test
	public void fatorialTest() {
		
		Fatorial fatorial = new Fatorial();
		
		Assert.assertEquals(1200, fatorial.obterFatorial(8));
	}
	
	@test
	public void eZeroOuUmTest() {
		
		Fatorial fatorial = new Fatorial();
		
		Assert.assertEquals(true, fatorial.eZeroOuUm(0));
		Assert.assertEquals(true, fatorial.eZeroOuUm(1));
		Assert.assertEquals(false, fatorial.eZeroOuUm(5));
	}
}  
