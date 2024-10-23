package pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Cliente;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.IClienteService;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.util.convert.ClienteConvert;
import pe.edu.cibertec.ws.objects.GetClienteResponse;
import pe.edu.cibertec.ws.objects.GetClientesResponse;
import pe.edu.cibertec.ws.objects.PostClienteRequest;
import pe.edu.cibertec.ws.objects.PostClienteResponse;

@RequiredArgsConstructor
@Service
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteConvert clienteConvert;

    @Override
    public GetClientesResponse listarClientes() {
        GetClientesResponse getClientesResponse = new GetClientesResponse();
        getClientesResponse.getClientes().addAll(
                clienteConvert.mapToClientewsList(clienteRepository.findAll()));

        return getClientesResponse;
    }

    @Override
    public GetClienteResponse obtenerClientePorId(Integer id) {
        GetClienteResponse getClienteResponse = new GetClienteResponse();
        Cliente cliente = clienteRepository.findById(id).orElse(null);

        if (cliente == null) {
            throw new NotFoundException("El cliente con el id " + id + " no existe");
        }

        getClienteResponse.setCliente(
                clienteConvert.mapToClientews(cliente));

        return getClienteResponse;
    }

    @Override
    public PostClienteResponse guardarCliente(PostClienteRequest request) {
        PostClienteResponse postClienteResponse = new PostClienteResponse();
        Cliente cliente = clienteRepository.save(
                clienteConvert.mapToCliente(request.getCliente()));
        postClienteResponse.setCliente(
                clienteConvert.mapToClientews(cliente));

        return postClienteResponse;
    }

}
