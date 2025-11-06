package sn.poste.backend_gestion_courrier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.poste.backend_gestion_courrier.entities.Expediteur;

public interface ExpediteurRepository extends JpaRepository<Expediteur, Long> {


}
