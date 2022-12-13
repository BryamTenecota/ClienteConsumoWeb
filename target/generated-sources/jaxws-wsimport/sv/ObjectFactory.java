
package sv;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv package. 
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

    private final static QName _Hello_QNAME = new QName("http://sv/", "hello");
    private final static QName _ParimparResponse_QNAME = new QName("http://sv/", "parimparResponse");
    private final static QName _Parimpar_QNAME = new QName("http://sv/", "parimpar");
    private final static QName _Alturamaxima_QNAME = new QName("http://sv/", "alturamaxima");
    private final static QName _Operaciones_QNAME = new QName("http://sv/", "operaciones");
    private final static QName _Potencia_QNAME = new QName("http://sv/", "potencia");
    private final static QName _GravitacionuniversalResponse_QNAME = new QName("http://sv/", "gravitacionuniversalResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://sv/", "helloResponse");
    private final static QName _DesplazamientoResponse_QNAME = new QName("http://sv/", "desplazamientoResponse");
    private final static QName _PotenciaResponse_QNAME = new QName("http://sv/", "potenciaResponse");
    private final static QName _Diccionario_QNAME = new QName("http://sv/", "diccionario");
    private final static QName _DiccionarioResponse_QNAME = new QName("http://sv/", "diccionarioResponse");
    private final static QName _Login_QNAME = new QName("http://sv/", "login");
    private final static QName _LoginResponse_QNAME = new QName("http://sv/", "loginResponse");
    private final static QName _AlturamaximaResponse_QNAME = new QName("http://sv/", "alturamaximaResponse");
    private final static QName _Gravitacionuniversal_QNAME = new QName("http://sv/", "gravitacionuniversal");
    private final static QName _OperacionesResponse_QNAME = new QName("http://sv/", "operacionesResponse");
    private final static QName _Desplazamiento_QNAME = new QName("http://sv/", "desplazamiento");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Gravitacionuniversal }
     * 
     */
    public Gravitacionuniversal createGravitacionuniversal() {
        return new Gravitacionuniversal();
    }

    /**
     * Create an instance of {@link OperacionesResponse }
     * 
     */
    public OperacionesResponse createOperacionesResponse() {
        return new OperacionesResponse();
    }

    /**
     * Create an instance of {@link AlturamaximaResponse }
     * 
     */
    public AlturamaximaResponse createAlturamaximaResponse() {
        return new AlturamaximaResponse();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Desplazamiento }
     * 
     */
    public Desplazamiento createDesplazamiento() {
        return new Desplazamiento();
    }

    /**
     * Create an instance of {@link DiccionarioResponse }
     * 
     */
    public DiccionarioResponse createDiccionarioResponse() {
        return new DiccionarioResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Diccionario }
     * 
     */
    public Diccionario createDiccionario() {
        return new Diccionario();
    }

    /**
     * Create an instance of {@link Potencia }
     * 
     */
    public Potencia createPotencia() {
        return new Potencia();
    }

    /**
     * Create an instance of {@link DesplazamientoResponse }
     * 
     */
    public DesplazamientoResponse createDesplazamientoResponse() {
        return new DesplazamientoResponse();
    }

    /**
     * Create an instance of {@link PotenciaResponse }
     * 
     */
    public PotenciaResponse createPotenciaResponse() {
        return new PotenciaResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GravitacionuniversalResponse }
     * 
     */
    public GravitacionuniversalResponse createGravitacionuniversalResponse() {
        return new GravitacionuniversalResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ParimparResponse }
     * 
     */
    public ParimparResponse createParimparResponse() {
        return new ParimparResponse();
    }

    /**
     * Create an instance of {@link Alturamaxima }
     * 
     */
    public Alturamaxima createAlturamaxima() {
        return new Alturamaxima();
    }

    /**
     * Create an instance of {@link Operaciones }
     * 
     */
    public Operaciones createOperaciones() {
        return new Operaciones();
    }

    /**
     * Create an instance of {@link Parimpar }
     * 
     */
    public Parimpar createParimpar() {
        return new Parimpar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParimparResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "parimparResponse")
    public JAXBElement<ParimparResponse> createParimparResponse(ParimparResponse value) {
        return new JAXBElement<ParimparResponse>(_ParimparResponse_QNAME, ParimparResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Parimpar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "parimpar")
    public JAXBElement<Parimpar> createParimpar(Parimpar value) {
        return new JAXBElement<Parimpar>(_Parimpar_QNAME, Parimpar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Alturamaxima }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "alturamaxima")
    public JAXBElement<Alturamaxima> createAlturamaxima(Alturamaxima value) {
        return new JAXBElement<Alturamaxima>(_Alturamaxima_QNAME, Alturamaxima.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "operaciones")
    public JAXBElement<Operaciones> createOperaciones(Operaciones value) {
        return new JAXBElement<Operaciones>(_Operaciones_QNAME, Operaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Potencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "potencia")
    public JAXBElement<Potencia> createPotencia(Potencia value) {
        return new JAXBElement<Potencia>(_Potencia_QNAME, Potencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GravitacionuniversalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "gravitacionuniversalResponse")
    public JAXBElement<GravitacionuniversalResponse> createGravitacionuniversalResponse(GravitacionuniversalResponse value) {
        return new JAXBElement<GravitacionuniversalResponse>(_GravitacionuniversalResponse_QNAME, GravitacionuniversalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DesplazamientoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "desplazamientoResponse")
    public JAXBElement<DesplazamientoResponse> createDesplazamientoResponse(DesplazamientoResponse value) {
        return new JAXBElement<DesplazamientoResponse>(_DesplazamientoResponse_QNAME, DesplazamientoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PotenciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "potenciaResponse")
    public JAXBElement<PotenciaResponse> createPotenciaResponse(PotenciaResponse value) {
        return new JAXBElement<PotenciaResponse>(_PotenciaResponse_QNAME, PotenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Diccionario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "diccionario")
    public JAXBElement<Diccionario> createDiccionario(Diccionario value) {
        return new JAXBElement<Diccionario>(_Diccionario_QNAME, Diccionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiccionarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "diccionarioResponse")
    public JAXBElement<DiccionarioResponse> createDiccionarioResponse(DiccionarioResponse value) {
        return new JAXBElement<DiccionarioResponse>(_DiccionarioResponse_QNAME, DiccionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlturamaximaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "alturamaximaResponse")
    public JAXBElement<AlturamaximaResponse> createAlturamaximaResponse(AlturamaximaResponse value) {
        return new JAXBElement<AlturamaximaResponse>(_AlturamaximaResponse_QNAME, AlturamaximaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Gravitacionuniversal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "gravitacionuniversal")
    public JAXBElement<Gravitacionuniversal> createGravitacionuniversal(Gravitacionuniversal value) {
        return new JAXBElement<Gravitacionuniversal>(_Gravitacionuniversal_QNAME, Gravitacionuniversal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "operacionesResponse")
    public JAXBElement<OperacionesResponse> createOperacionesResponse(OperacionesResponse value) {
        return new JAXBElement<OperacionesResponse>(_OperacionesResponse_QNAME, OperacionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Desplazamiento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sv/", name = "desplazamiento")
    public JAXBElement<Desplazamiento> createDesplazamiento(Desplazamiento value) {
        return new JAXBElement<Desplazamiento>(_Desplazamiento_QNAME, Desplazamiento.class, null, value);
    }

}
