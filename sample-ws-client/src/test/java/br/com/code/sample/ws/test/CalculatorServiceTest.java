package br.com.code.sample.ws.test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import br.com.code.sample.ws.CalculatorService;
import br.com.code.ws.jaxws.samples.v1.CalculatorWs;

@RunWith(BlockJUnit4ClassRunner.class)
public class CalculatorServiceTest {
	
	@Test
	public void add(){
	
		Integer result = getPort().add(2, 3);
		
		Assert.assertEquals(new Integer(5), result);
	}
	
	@Test
	public void subtract(){
		
		Integer result = getPort().subtract(10, 7);
		
		Assert.assertEquals(new Integer(3), result);
	}
	
	@Test
	public void divide(){
		
		Double result = getPort().divide(10, 3);
		
		Assert.assertEquals(null, new Double(3.33), result, 2);
	}
	
	@Test
	public void multiply(){
		
		Integer result = getPort().multiply(5, 6);
		
		Assert.assertEquals(new Integer(30), result);
	}
	
	
	public CalculatorWs getPort(){
		CalculatorService cs = new CalculatorService();
		return cs.getCalculatorPort();
	}
	

}
