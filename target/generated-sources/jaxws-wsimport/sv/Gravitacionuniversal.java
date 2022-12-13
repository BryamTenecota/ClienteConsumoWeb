
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para gravitacionuniversal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="gravitacionuniversal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="masa1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="masa2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gravitacionuniversal", propOrder = {
    "masa1",
    "masa2",
    "distancia"
})
public class Gravitacionuniversal {

    protected double masa1;
    protected double masa2;
    protected double distancia;

    /**
     * Obtiene el valor de la propiedad masa1.
     * 
     */
    public double getMasa1() {
        return masa1;
    }

    /**
     * Define el valor de la propiedad masa1.
     * 
     */
    public void setMasa1(double value) {
        this.masa1 = value;
    }

    /**
     * Obtiene el valor de la propiedad masa2.
     * 
     */
    public double getMasa2() {
        return masa2;
    }

    /**
     * Define el valor de la propiedad masa2.
     * 
     */
    public void setMasa2(double value) {
        this.masa2 = value;
    }

    /**
     * Obtiene el valor de la propiedad distancia.
     * 
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Define el valor de la propiedad distancia.
     * 
     */
    public void setDistancia(double value) {
        this.distancia = value;
    }

}
