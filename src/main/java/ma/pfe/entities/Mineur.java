package ma.pfe.entities;

import javax.persistence.Entity;

@Entity
public class Mineur extends StudentEntity{
    private Boolean isEligible;
}
