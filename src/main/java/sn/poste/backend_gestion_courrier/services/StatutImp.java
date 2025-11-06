package sn.poste.backend_gestion_courrier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.poste.backend_gestion_courrier.entities.Statut;
import sn.poste.backend_gestion_courrier.repositories.StatutRepository;

import java.util.Collection;
import java.util.Optional;

@Service
public class StatutImp implements  StatutService {
    @Autowired
    private StatutRepository statutRepository ;

    @Override
    public Collection<Statut> getAll() {
        return statutRepository.findAll();
    }

    @Override
    public Optional<Statut> getById(Long id) {
        return statutRepository.findById(id);
    }

    @Override
    public Statut save(Statut statut) {
        return statutRepository.save(statut);
    }

    @Override
    public Statut update(Statut statut) {
        return statutRepository.save(statut);
    }

    @Override
    public void deleteById(Long id) {
        statutRepository.deleteById(id);

    }
}
