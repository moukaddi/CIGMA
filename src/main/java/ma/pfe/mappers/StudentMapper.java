package ma.pfe.mappers;

import ma.pfe.dtos.AdresseDTO;
import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.Adresse;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentEntity convertToEntity(StudentDTO s) {
        StudentEntity entity = new StudentEntity();
        StudentId studentId = new StudentId();
        Adresse adresse = new Adresse();

        studentId.setId(s.getStudentIdDTO().getId());
        studentId.setCode(s.getStudentIdDTO().getCode());

        adresse.setRue(s.getAdresse().getRue());
        adresse.setAvenue(s.getAdresse().getAvenue());
        adresse.setNumber(s.getAdresse().getNumber());

        entity.setStudentId(studentId);
        entity.setName(s.getName());
        entity.setAdresse(adresse);
        return entity;
    }

    public StudentDTO convertToDto(StudentEntity s) {
        StudentDTO dto = new StudentDTO();
        StudentIdDTO studentIdDTO = new StudentIdDTO();
        AdresseDTO adresseDTO = new AdresseDTO();

        studentIdDTO.setId(s.getStudentId().getId());
        studentIdDTO.setCode(s.getStudentId().getCode());

        adresseDTO.setAvenue(s.getAdresse().getAvenue());
        adresseDTO.setRue(s.getAdresse().getRue());
        adresseDTO.setNumber(s.getAdresse().getNumber());

        dto.setStudentIdDTO(studentIdDTO);
        dto.setName(s.getName());
        dto.setAdresse(adresseDTO);

        return dto;
    }

    public List<StudentEntity> convertToEntities(List<StudentDTO> s) {
       return s.stream().map(this::convertToEntity).collect(Collectors.toList());
    }

    public List<StudentDTO> convertToDtos(List<StudentEntity> s) {
        return s.stream().map(this::convertToDto).collect(Collectors.toList());
    }
}
