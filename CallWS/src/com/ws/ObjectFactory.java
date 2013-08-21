
package com.ws;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PessoagetPessoa_QNAME = new QName("http://150.164.192.59:8080/Math", "PessoagetPessoa");
    private final static QName _Returnssoma_QNAME = new QName("http://150.164.192.59:8080/Math", "returnssoma");
    private final static QName _ParamsgetPessoa_QNAME = new QName("http://150.164.192.59:8080/Math", "paramsgetPessoa");
    private final static QName _ReturnsimprimePessoa_QNAME = new QName("http://150.164.192.59:8080/Math", "returnsimprimePessoa");
    private final static QName _Paramssoma_QNAME = new QName("http://150.164.192.59:8080/Math", "paramssoma");
    private final static QName _PessoaimprimePessoa_QNAME = new QName("http://150.164.192.59:8080/Math", "PessoaimprimePessoa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link ParamssomaTypes }
     * 
     */
    public ParamssomaTypes createParamssomaTypes() {
        return new ParamssomaTypes();
    }

    /**
     * Create an instance of {@link ParamsgetPessoaTypes }
     * 
     */
    public ParamsgetPessoaTypes createParamsgetPessoaTypes() {
        return new ParamsgetPessoaTypes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://150.164.192.59:8080/Math", name = "PessoagetPessoa")
    public JAXBElement<Pessoa> createPessoagetPessoa(Pessoa value) {
        return new JAXBElement<Pessoa>(_PessoagetPessoa_QNAME, Pessoa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://150.164.192.59:8080/Math", name = "returnssoma")
    public JAXBElement<BigInteger> createReturnssoma(BigInteger value) {
        return new JAXBElement<BigInteger>(_Returnssoma_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamsgetPessoaTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://150.164.192.59:8080/Math", name = "paramsgetPessoa")
    public JAXBElement<ParamsgetPessoaTypes> createParamsgetPessoa(ParamsgetPessoaTypes value) {
        return new JAXBElement<ParamsgetPessoaTypes>(_ParamsgetPessoa_QNAME, ParamsgetPessoaTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://150.164.192.59:8080/Math", name = "returnsimprimePessoa")
    public JAXBElement<String> createReturnsimprimePessoa(String value) {
        return new JAXBElement<String>(_ReturnsimprimePessoa_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamssomaTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://150.164.192.59:8080/Math", name = "paramssoma")
    public JAXBElement<ParamssomaTypes> createParamssoma(ParamssomaTypes value) {
        return new JAXBElement<ParamssomaTypes>(_Paramssoma_QNAME, ParamssomaTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pessoa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://150.164.192.59:8080/Math", name = "PessoaimprimePessoa")
    public JAXBElement<Pessoa> createPessoaimprimePessoa(Pessoa value) {
        return new JAXBElement<Pessoa>(_PessoaimprimePessoa_QNAME, Pessoa.class, null, value);
    }

}
