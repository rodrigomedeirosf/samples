package br.com.code.sample.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import br.com.code.ws.jaxws.samples.v1.CalculatorWs;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2015-02-16T18:33:54.158-02:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "CalculatorService", 
                  wsdlLocation = "http://localhost:8080/sample-ws/calculator?wsdl",
                  targetNamespace = "http://ws.sample.code.com.br/") 
public class CalculatorService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.sample.code.com.br/", "CalculatorService");
    public final static QName CalculatorPort = new QName("http://ws.sample.code.com.br/", "CalculatorPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/sample-ws/calculator?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalculatorService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/sample-ws/calculator?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalculatorService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalculatorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalculatorService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalculatorService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CalculatorService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns CalculatorWs
     */
    @WebEndpoint(name = "CalculatorPort")
    public CalculatorWs getCalculatorPort() {
        return super.getPort(CalculatorPort, CalculatorWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorWs
     */
    @WebEndpoint(name = "CalculatorPort")
    public CalculatorWs getCalculatorPort(WebServiceFeature... features) {
        return super.getPort(CalculatorPort, CalculatorWs.class, features);
    }

}
