package pe.edu.cibertec.DSWII_EF_SOAP_XXX.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.DSWII_EF_SOAP_XXX.model.Mascota;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {
}
