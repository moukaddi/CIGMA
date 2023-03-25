package ma.pfe.dtos;

import java.util.List;

public class StudentDTO {
    private StudentIdDTO studentId;
    private List<CourseDTO> courses;
    private String name;
    private AdresseDTO adresse;
    private NiveauDTO niveau;

    public StudentIdDTO getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDTO studentId) {
        this.studentId = studentId;
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

    public List<CourseDTO> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDTO> courses) {
        this.courses = courses;
    }

    public NiveauDTO getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauDTO niveau) {
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", courses=" + courses +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                ", niveau=" + niveau +
                '}';
    }
}
