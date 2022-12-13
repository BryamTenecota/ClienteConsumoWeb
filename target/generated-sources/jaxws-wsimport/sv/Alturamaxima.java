
package sv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para alturamaxima complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="alturamaxima">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="velocidad" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="angulo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alturamaxima", propOrder = {
    "velocidad",
    "angulo"
})
public class Alturamaxima {

    protected double velocidad;
    protected double angulo;

    /**
     * Obtiene el valor de la propiedad velocidad.
     * 
     */
    public double getVelocidad() {
        return velocidad;
    }

    /**
     * Define el valor de la propiedad velocidad.
     * 
     */
    public void setVelocidad(double value) {
        this.velocidad = value;
    }

    /**
     * Obtiene el valor de la propiedad angulo.
     * 
     */
    public double getAngulo() {
        return angulo;
    }

    /**
     * Define el valor de la propiedad angulo.
     * 
     */
    public void setAngulo(double value) {
        this.angulo = value;
    }

}
