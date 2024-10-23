package pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Veterinario;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.repository.VeterinarioRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.IVeterinarioService;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.util.convert.VeterinarioConvert;
import pe.edu.cibertec.ws.objects.GetVeterinarioResponse;
import pe.edu.cibertec.ws.objects.GetVeterinariosResponse;
import pe.edu.cibertec.ws.objects.PostVeterinarioRequest;
import pe.edu.cibertec.ws.objects.PostVeterinarioResponse;

@RequiredArgsConstructor
@Service
public class VeterinarioService implements IVeterinarioService {

    private final VeterinarioRepository veterinarioRepository;
    private final VeterinarioConvert veterinarioConvert;

    @Override
    public GetVeterinariosResponse listarVeterinarios() {
        GetVeterinariosResponse getVeterinariosResponse = new GetVeterinariosResponse();

        getVeterinariosResponse.getVeterinarios().addAll(
                veterinarioConvert.mapToVeterinariowsList(veterinarioRepository.findAll()));

        return getVeterinariosResponse;
    }

    @Override
    public GetVeterinarioResponse obtenerVeterinarioPorId(Integer id) {
        GetVeterinarioResponse getVeterinarioResponse = new GetVeterinarioResponse();
        Veterinario veterinario = veterinarioRepository.findById(id).orElse(null);

        if (veterinario == null) {
            throw new NotFoundException("El veterinario con el id " + id + " no existe");
        }

        getVeterinarioResponse.setVeterinario(
                veterinarioConvert.mapToVeterinariows(veterinario));

        return getVeterinarioResponse;
    }

    @Override
    public PostVeterinarioResponse guardarVeterinario(PostVeterinarioRequest request) {
        PostVeterinarioResponse postVeterinarioResponse = new PostVeterinarioResponse();
        Veterinario veterinario = veterinarioRepository.save(
                veterinarioConvert.mapToVeterinario(request.getVeterinario()));
        postVeterinarioResponse.setVeterinario(
                veterinarioConvert.mapToVeterinariows(veterinario));

        return postVeterinarioResponse;
    }

}
