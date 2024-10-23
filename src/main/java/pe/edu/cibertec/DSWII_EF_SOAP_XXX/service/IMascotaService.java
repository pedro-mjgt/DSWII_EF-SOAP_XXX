package pe.edu.cibertec.DSWII_EF_SOAP_XXX.service;

import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Mascota;
import pe.edu.cibertec.ws.objects.GetMascotaResponse;
import pe.edu.cibertec.ws.objects.GetMascotasResponse;
import pe.edu.cibertec.ws.objects.PostMascotaRequest;
import pe.edu.cibertec.ws.objects.PostMascotaResponse;

import java.util.List;

public interface IMascotaService {

    GetMascotasResponse listarMascotas();
    GetMascotaResponse obtenerMascotaPorId(Integer id);
    PostMascotaResponse guardarMascota(PostMascotaRequest request);

}
