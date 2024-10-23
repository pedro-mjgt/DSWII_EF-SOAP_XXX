package pe.edu.cibertec.DSWII_EF_SOAP_XXX.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Cliente;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Veterinario;
import pe.edu.cibertec.ws.objects.Clientews;
import pe.edu.cibertec.ws.objects.Veterinariows;

import java.util.ArrayList;
import java.util.List;

@Component
public class VeterinarioConvert {

    public Veterinario mapToVeterinario(Veterinariows veterinariows) {
        Veterinario veterinario = new Veterinario();

        veterinario.setIdveterinario(veterinariows.getIdveterinario());
        veterinario.setNombre(veterinariows.getNombre());
        veterinario.setEspecialidad(veterinariows.getEspecialidad());
        veterinario.setTelefono(veterinariows.getTelefono());
        veterinario.setEmail(veterinariows.getEmail());

        return veterinario;
    }

    public Veterinariows mapToVeterinariows(Veterinario veterinario) {
        Veterinariows veterinariows = new Veterinariows();

        veterinariows.setIdveterinario(veterinario.getIdveterinario());
        veterinariows.setNombre(veterinario.getNombre());
        veterinariows.setEspecialidad(veterinario.getEspecialidad());
        veterinariows.setTelefono(veterinario.getTelefono());
        veterinariows.setEmail(veterinario.getEmail());

        return veterinariows;
    }

    public List<Veterinario> mapToVeterinarioList(List<Veterinariows> veterinariowsList) {
        List<Veterinario> veterinarioList = new ArrayList<>();

        for (Veterinariows veterinariows : veterinariowsList) {
            veterinarioList.add(mapToVeterinario(veterinariows));
        }

        return veterinarioList;
    }

    public List<Veterinariows> mapToVeterinariowsList(List<Veterinario> veterinarioList) {
        List<Veterinariows> veterinariowsList = new ArrayList<>();

        for (Veterinario veterinario : veterinarioList) {
            veterinariowsList.add(mapToVeterinariows(veterinario));
        }

        return veterinariowsList;
    }

}
