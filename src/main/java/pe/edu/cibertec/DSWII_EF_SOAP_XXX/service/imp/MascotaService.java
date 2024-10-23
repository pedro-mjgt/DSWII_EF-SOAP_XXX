package pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.imp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.exception.NotFoundException;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Mascota;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.repository.MascotaRepository;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.service.IMascotaService;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.util.convert.MascotaConvert;
import pe.edu.cibertec.ws.objects.GetMascotaResponse;
import pe.edu.cibertec.ws.objects.GetMascotasResponse;
import pe.edu.cibertec.ws.objects.PostMascotaRequest;
import pe.edu.cibertec.ws.objects.PostMascotaResponse;

@RequiredArgsConstructor
@Service
public class MascotaService implements IMascotaService {

    private final MascotaRepository mascotaRepository;
    private final MascotaConvert mascotaConvert;

    @Override
    public GetMascotasResponse listarMascotas() {
        GetMascotasResponse getMascotasResponse = new GetMascotasResponse();

        getMascotasResponse.getMascotas().addAll(
                mascotaConvert.mapToMascotawsList(mascotaRepository.findAll()));

        return getMascotasResponse;
    }

    @Override
    public GetMascotaResponse obtenerMascotaPorId(Integer id) {
        GetMascotaResponse getMascotaResponse = new GetMascotaResponse();
        Mascota mascota = mascotaRepository.findById(id).orElse(null);

        if (mascota == null) {
            throw new NotFoundException("La mascota con el id " + id + " no existe");
        }

        getMascotaResponse.setMascota(
                mascotaConvert.mapToMascotaws(mascota));

        return getMascotaResponse;
    }

    @Override
    public PostMascotaResponse guardarMascota(PostMascotaRequest request) {
        PostMascotaResponse postMascotaResponse = new PostMascotaResponse();
        Mascota mascota = mascotaRepository.save(
                mascotaConvert.mapToMascota(request.getMascota()));
        postMascotaResponse.setMascota(
                mascotaConvert.mapToMascotaws(mascota));

        return postMascotaResponse;
    }

}
