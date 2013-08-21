
package com.ws;

import java.math.BigInteger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MathPortType", targetNamespace = "http://150.164.192.59:8080/Math")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MathPortType {


    /**
     * 
     * @param parametersgetPessoa
     * @return
     *     returns com.ws.Pessoa
     */
    @WebMethod(action = "http://150.164.192.59:8080/Math/getPessoa")
    @WebResult(name = "PessoagetPessoa", targetNamespace = "http://150.164.192.59:8080/Math", partName = "returnsgetPessoa")
    public Pessoa getPessoa(
        @WebParam(name = "paramsgetPessoa", targetNamespace = "http://150.164.192.59:8080/Math", partName = "parametersgetPessoa")
        ParamsgetPessoaTypes parametersgetPessoa);

    /**
     * 
     * @param parametersimprimePessoa
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://150.164.192.59:8080/Math/imprimePessoa")
    @WebResult(name = "returnsimprimePessoa", targetNamespace = "http://150.164.192.59:8080/Math", partName = "returnsimprimePessoa")
    public String imprimePessoa(
        @WebParam(name = "PessoaimprimePessoa", targetNamespace = "http://150.164.192.59:8080/Math", partName = "parametersimprimePessoa")
        Pessoa parametersimprimePessoa);

    /**
     * 
     * @param parameterssoma
     * @return
     *     returns java.math.BigInteger
     */
    @WebMethod(action = "http://150.164.192.59:8080/Math/soma")
    @WebResult(name = "returnssoma", targetNamespace = "http://150.164.192.59:8080/Math", partName = "returnssoma")
    public BigInteger soma(
        @WebParam(name = "paramssoma", targetNamespace = "http://150.164.192.59:8080/Math", partName = "parameterssoma")
        ParamssomaTypes parameterssoma);

}