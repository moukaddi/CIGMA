package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {

    public StudentEntity convertToEntity(StudentDTO s) {
        StudentEntity entity = new StudentEntity();
        entity.setId(s.getId());
        entity.setName(s.getName());
        return entity;
    }

    public StudentDTO convertToDto(StudentEntity s) {
        StudentDTO dto = new StudentDTO();
        dto.setId(s.getId());
        dto.setName(s.getName());
        return dto;
    }

    public List<StudentEntity> convertToEntities(List<StudentDTO> s) {
       return s.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

    public List<StudentDTO> convertToDtos(List<StudentEntity> s) {
        return s.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }
}
