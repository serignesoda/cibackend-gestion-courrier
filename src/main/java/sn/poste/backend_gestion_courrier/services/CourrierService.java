package sn.poste.backend_gestion_courrier.services;


import sn.poste.backend_gestion_courrier.entities.Courrier;

import java.util.Collection;
import java.util.Optional;

public interface CourrierService {
    Collection<Courrier> getAll();
    Optional<Courrier> getById(Long id);
    Courrier save(Courrier courrier);
    Courrier update(Courrier  courrier);
    void deleteById(Long id);

}
