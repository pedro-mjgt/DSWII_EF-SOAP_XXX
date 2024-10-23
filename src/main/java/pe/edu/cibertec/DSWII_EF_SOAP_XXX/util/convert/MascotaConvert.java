package pe.edu.cibertec.DSWII_EF_SOAP_XXX.util.convert;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Cliente;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Mascota;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Veterinario;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.repository.ClienteRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.imp.ClienteService;
import pe.edu.cibertec.ws.objects.Mascotaws;
import pe.edu.cibertec.ws.objects.Veterinariows;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class MascotaConvert {

    private final ClienteRepository clienteRepository;

    public Mascota mapToMascota(Mascotaws mascotaws) {
        Mascota mascota = new Mascota();

        mascota.setIdmascota(mascotaws.getIdmascota());
        mascota.setNombre(mascotaws.getNombre());
        mascota.setEspecie(mascotaws.getEspecie());
        mascota.setRaza(mascotaws.getRaza());
        Cliente cliente = clienteRepository.findById(mascotaws.getIdcliente()).orElse(null);
        mascota.setCliente(cliente);

        return mascota;
    }

    public Mascotaws mapToMascotaws(Mascota mascota) {
        Mascotaws mascotaws = new Mascotaws();

        mascotaws.setIdmascota(mascota.getIdmascota());
        mascotaws.setNombre(mascota.getNombre());
        mascotaws.setEspecie(mascota.getEspecie());
        mascotaws.setRaza(mascota.getRaza());
        mascotaws.setIdcliente(mascota.getCliente().getIdcliente());

        return mascotaws;
    }

    public List<Mascota> mapToMascotaList(List<Mascotaws> mascotawsList) {
        List<Mascota> mascotaList = new ArrayList<>();

        for (Mascotaws mascotaws : mascotawsList) {
            mascotaList.add(mapToMascota(mascotaws));
        }

        return mascotaList;
    }

    public List<Mascotaws> mapToMascotawsList(List<Mascota> mascotaList) {
        List<Mascotaws> mascotawsList = new ArrayList<>();

        for (Mascota mascota : mascotaList) {
            mascotawsList.add(mapToMascotaws(mascota));
        }

        return mascotawsList;
    }

}
