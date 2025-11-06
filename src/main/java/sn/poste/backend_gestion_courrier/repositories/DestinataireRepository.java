package sn.poste.backend_gestion_courrier.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.poste.backend_gestion_courrier.entities.Destinataire;

public interface DestinataireRepository extends JpaRepository<Destinataire, Long> {

}
