package pe.edu.cibertec.DSWII_EF_SOAP_XXX.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.IMascotaService;
import pe.edu.cibertec.ws.objects.*;

@Endpoint
public class MascotaEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IMascotaService mascotaService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMascotasRequest")
    @ResponsePayload
    public GetMascotasResponse getMascotas(
            @RequestPayload GetMascotasRequest request
    ) {
        return mascotaService.listarMascotas();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMascotaRequest")
    @ResponsePayload
    public GetMascotaResponse getMascotaPorId(
            @RequestPayload GetMascotaRequest request
    ) {
        return mascotaService.obtenerMascotaPorId(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postMascotaRequest")
    @ResponsePayload
    public PostMascotaResponse saveMascota(
            @RequestPayload PostMascotaRequest request
    ) {
        return mascotaService.guardarMascota(request);
    }

}
