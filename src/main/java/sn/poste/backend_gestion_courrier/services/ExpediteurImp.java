package sn.poste.backend_gestion_courrier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.poste.backend_gestion_courrier.entities.Expediteur;
import sn.poste.backend_gestion_courrier.repositories.ExpediteurRepository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ExpediteurImp implements ExpediteurService{

    @Autowired
    private ExpediteurRepository expediteurRepository ;

    @Override
    public Collection<Expediteur> getAll() {
        return expediteurRepository.findAll();
    }

    @Override
    public Optional<Expediteur> getById(Long id) {
        return expediteurRepository.findById(id);
    }

    @Override
    public Expediteur save(Expediteur expediteur) {
        return expediteurRepository.save(expediteur);
    }

    @Override
    public Expediteur update(Expediteur expediteur) {
        return expediteurRepository.save(expediteur);
    }

    @Override
    public void deleteById(Long id) {
        expediteurRepository.deleteById(id);

    }
}
