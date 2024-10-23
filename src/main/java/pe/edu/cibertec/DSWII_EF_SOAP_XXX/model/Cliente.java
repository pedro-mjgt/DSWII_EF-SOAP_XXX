package pe.edu.cibertec.DSWII_EF_SOAP_XXX.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    private String nombre;
    private String telefono;
    private String direccion;
    private String email;

}
