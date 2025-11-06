package sn.poste.backend_gestion_courrier.services;


import sn.poste.backend_gestion_courrier.entities.Destinataire;

import java.util.Collection;
import java.util.Optional;


public interface DestinataireService {
    Collection<Destinataire> getAll();
    Optional<Destinataire> getById(Long id);
    Destinataire save(Destinataire destinataire);
    Destinataire update(Destinataire  destinataire);
    void deleteById(Long id);

}
