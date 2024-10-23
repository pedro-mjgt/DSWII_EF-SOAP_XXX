package pe.edu.cibertec.DSWII_EF_SOAP_XXX.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "veterinario")
public class Veterinario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idveterinario;

    private String nombre;
    private String especialidad;
    private String telefono;
    private String email;

}
