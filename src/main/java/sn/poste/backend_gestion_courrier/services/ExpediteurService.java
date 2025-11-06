package sn.poste.backend_gestion_courrier.services;

import sn.poste.backend_gestion_courrier.entities.Expediteur;

import java.util.Collection;
import java.util.Optional;


public interface ExpediteurService {

    Collection<Expediteur> getAll();
    Optional<Expediteur> getById(Long id);
    Expediteur save(Expediteur expediteur);
    Expediteur update(Expediteur  expediteur);
    void deleteById(Long id);

}
