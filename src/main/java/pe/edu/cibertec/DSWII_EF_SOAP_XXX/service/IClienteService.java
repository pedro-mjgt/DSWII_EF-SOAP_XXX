package pe.edu.cibertec.DSWII_EF_SOAP_XXX.service;

import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Cliente;
import pe.edu.cibertec.ws.objects.GetClienteResponse;
import pe.edu.cibertec.ws.objects.GetClientesResponse;
import pe.edu.cibertec.ws.objects.PostClienteRequest;
import pe.edu.cibertec.ws.objects.PostClienteResponse;

import java.util.List;

public interface IClienteService {

    GetClientesResponse listarClientes();
    GetClienteResponse obtenerClientePorId(Integer id);
    PostClienteResponse guardarCliente(PostClienteRequest request);

}
