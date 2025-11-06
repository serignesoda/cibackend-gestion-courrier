package sn.poste.backend_gestion_courrier.services;

import sn.poste.backend_gestion_courrier.entities.Statut;

import java.util.Collection;
import java.util.Optional;


public interface StatutService {
    Collection<Statut> getAll();
    Optional<Statut> getById(Long id);
    Statut save(Statut statut);
    Statut update(Statut  statut);
    void deleteById(Long id);

}