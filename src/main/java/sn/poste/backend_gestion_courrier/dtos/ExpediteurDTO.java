package sn.poste.backend_gestion_courrier.dtos;

import lombok.Data;

@Data

public class ExpediteurDTO {

    private Long id;
    private String nom;
    private String email;
    private String telephone ;
    private String adresse ;

}
