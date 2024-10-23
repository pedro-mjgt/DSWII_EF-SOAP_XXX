package pe.edu.cibertec.DSWII_EF_SOAP_XXX.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.IVeterinarioService;
import pe.edu.cibertec.ws.objects.*;

@Endpoint
public class VeterinarioEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IVeterinarioService veterinarioService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVeterinariosRequest")
    @ResponsePayload
    public GetVeterinariosResponse getVeterinarios(
            @RequestPayload GetVeterinariosRequest request
    ) {
        return veterinarioService.listarVeterinarios();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getVeterinarioRequest")
    @ResponsePayload
    public GetVeterinarioResponse getVeterinarioPorId(
            @RequestPayload GetVeterinarioRequest request
    ) {
        return veterinarioService.obtenerVeterinarioPorId(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postVeterinarioRequest")
    @ResponsePayload
    public PostVeterinarioResponse saveVeterinario(
            @RequestPayload PostVeterinarioRequest request
    ) {
        return veterinarioService.guardarVeterinario(request);
    }

}
