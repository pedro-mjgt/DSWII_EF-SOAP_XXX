package pe.edu.cibertec.DSWII_EF_SOAP_XXX.service;

import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Cliente;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Veterinario;
import pe.edu.cibertec.ws.objects.*;

import java.util.List;

public interface IVeterinarioService {

    GetVeterinariosResponse listarVeterinarios();
    GetVeterinarioResponse obtenerVeterinarioPorId(Integer id);
    PostVeterinarioResponse guardarVeterinario(PostVeterinarioRequest request);

}
