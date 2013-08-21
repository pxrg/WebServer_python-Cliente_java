/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package callws;

import com.ws.MathPortType;
import com.ws.ParamssomaTypes;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo.gomes
 */
public class CallWS {

    /**
     * @param args the command line arguments
     * Script para criar as classes a partir do WebService
     * $wsimport -keep -d C:\Projetos\CallWS\src -p com.ws http://localhost:8080/Math?wsdl
     * fonte: http://needforjava.files.wordpress.com/2010/07/criandoclientcomwsimport1.pdf
     */
    public static void main(String[] args) {
        URL url = null;
        try {
            URL baseUrl = com.ws.Math.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/Math?wsdl");
            com.ws.Math service = new com.ws.Math(url);
            MathPortType port =  service.getMathPort();
            ParamssomaTypes param = new ParamssomaTypes();
            param.setA(new BigInteger("10"));
            param.setB(new BigInteger("20"));
            System.out.println(port.soma(param));
        } catch (MalformedURLException ex) {
            Logger.getLogger(CallWS.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
