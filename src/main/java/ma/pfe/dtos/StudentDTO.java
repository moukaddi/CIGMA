package ma.pfe.dtos;

import ma.pfe.entities.Adresse;

public class StudentDTO {
    private StudentIdDTO studentIdDTO;
    private String name;
    private AdresseDTO adresse;

    public StudentIdDTO getStudentIdDTO() {
        return studentIdDTO;
    }

    public void setStudentIdDTO(StudentIdDTO studentIdDTO) {
        this.studentIdDTO = studentIdDTO;
    }

    public AdresseDTO getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseDTO adresse) {
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentIdDTO=" + studentIdDTO +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
