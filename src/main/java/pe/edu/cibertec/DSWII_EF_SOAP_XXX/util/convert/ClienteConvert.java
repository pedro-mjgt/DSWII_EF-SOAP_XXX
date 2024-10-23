package pe.edu.cibertec.DSWII_EF_SOAP_XXX.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Cliente;
import pe.edu.cibertec.ws.objects.Clientews;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteConvert {

    public Cliente mapToCliente(Clientews clientews) {
        Cliente cliente = new Cliente();

        cliente.setIdcliente(clientews.getIdcliente());
        cliente.setNombre(clientews.getNombre());
        cliente.setTelefono(clientews.getTelefono());
        cliente.setDireccion(clientews.getDireccion());
        cliente.setEmail(clientews.getEmail());

        return cliente;
    }

    public Clientews mapToClientews(Cliente cliente) {
        Clientews clientews = new Clientews();

        clientews.setIdcliente(cliente.getIdcliente());
        clientews.setNombre(cliente.getNombre());
        clientews.setTelefono(cliente.getTelefono());
        clientews.setDireccion(cliente.getDireccion());
        clientews.setEmail(cliente.getEmail());

        return clientews;
    }

    public List<Cliente> mapToClienteList(List<Clientews> clientewsList) {
        List<Cliente> clienteList = new ArrayList<>();

        for (Clientews clientews : clientewsList) {
            clienteList.add(mapToCliente(clientews));
        }

        return clienteList;
    }

    public List<Clientews> mapToClientewsList(List<Cliente> clienteList) {
        List<Clientews> clientewsList = new ArrayList<>();

        for (Cliente cliente : clienteList) {
            clientewsList.add(mapToClientews(cliente));
        }

        return clientewsList;
    }

}
