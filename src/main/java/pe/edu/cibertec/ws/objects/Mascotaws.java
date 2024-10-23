//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.10.23 a las 02:28:09 AM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para mascotaws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mascotaws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idmascota" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="especie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="raza" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idcliente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mascotaws", propOrder = {
    "idmascota",
    "nombre",
    "especie",
    "raza",
    "idcliente"
})
public class Mascotaws {

    protected int idmascota;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String especie;
    @XmlElement(required = true)
    protected String raza;
    protected int idcliente;

    /**
     * Obtiene el valor de la propiedad idmascota.
     * 
     */
    public int getIdmascota() {
        return idmascota;
    }

    /**
     * Define el valor de la propiedad idmascota.
     * 
     */
    public void setIdmascota(int value) {
        this.idmascota = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad especie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Define el valor de la propiedad especie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecie(String value) {
        this.especie = value;
    }

    /**
     * Obtiene el valor de la propiedad raza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Define el valor de la propiedad raza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaza(String value) {
        this.raza = value;
    }

    /**
     * Obtiene el valor de la propiedad idcliente.
     * 
     */
    public int getIdcliente() {
        return idcliente;
    }

    /**
     * Define el valor de la propiedad idcliente.
     * 
     */
    public void setIdcliente(int value) {
        this.idcliente = value;
    }

}
