package pe.edu.cibertec.DSWII_EF_SOAP_XXX.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmascota;

    private String  nombre;
    private String especie;
    private String raza;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

}
