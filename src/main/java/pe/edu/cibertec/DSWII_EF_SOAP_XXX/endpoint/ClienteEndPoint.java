package pe.edu.cibertec.DSWII_EF_SOAP_XXX.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.IClienteService;
import pe.edu.cibertec.ws.objects.*;

@Endpoint
public class ClienteEndPoint {

    private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

    @Autowired
    private IClienteService clienteService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClientesRequest")
    @ResponsePayload
    public GetClientesResponse getClientes(
            @RequestPayload GetClientesRequest request
    ) {
        return clienteService.listarClientes();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getClienteRequest")
    @ResponsePayload
    public GetClienteResponse getClientePorId(
            @RequestPayload GetClienteRequest request
    ) {
        return clienteService.obtenerClientePorId(request.getId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postClienteRequest")
    @ResponsePayload
    public PostClienteResponse saveCliente(
            @RequestPayload PostClienteRequest request
    ) {
        return clienteService.guardarCliente(request);
    }

}
