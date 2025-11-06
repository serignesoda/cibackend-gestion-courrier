package sn.poste.backend_gestion_courrier.dtos;

import lombok.Data;

import sn.poste.backend_gestion_courrier.entities.Destinataire;
import sn.poste.backend_gestion_courrier.entities.Expediteur;
import sn.poste.backend_gestion_courrier.entities.Statut;

import java.time.LocalDate;

@Data
public class CourrierDTO {

    private Long id;

    private String numero;
    private LocalDate dateReception;
    private String objet;

    private Expediteur expediteur;
    private Destinataire destinataire;
    private Statut statut;


}
