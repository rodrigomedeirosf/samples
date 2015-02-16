package br.com.code.sample.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace="http://ws.code.com.br/jaxws/samples/v1")
public interface CalculatorWs {
	
	@WebMethod(operationName="add")
	Integer add(Integer v1, Integer v2);
	
	@WebMethod(operationName="subtract")
	Integer subtract(Integer v1, Integer v2);
	
	@WebMethod(operationName="divide")
	Double divide(Integer v1, Integer v2);
	
	@WebMethod(operationName="multiply")
	Integer multiply(Integer v1, Integer v2);
}
