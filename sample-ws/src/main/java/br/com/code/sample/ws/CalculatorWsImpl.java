package br.com.code.sample.ws;

import javax.jws.WebService;

@WebService(serviceName="CalculatorService", portName="CalculatorPort", endpointInterface="br.com.code.sample.ws.CalculatorWs")
public class CalculatorWsImpl implements CalculatorWs {

	@Override
	public Integer add(Integer v1, Integer v2) {
		return v1 + v2;
	}

	@Override
	public Integer subtract(Integer v1, Integer v2) {
		return v1 - v2;
	}

	@Override
	public Double divide(Integer v1, Integer v2) {
		return v1.doubleValue()/v2;
	}

	@Override
	public Integer multiply(Integer v1, Integer v2) {
		return v1*v2;
	}
	
}
