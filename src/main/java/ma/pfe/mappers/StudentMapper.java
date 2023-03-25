package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface  StudentMapper {

     StudentEntity convertToEntity(StudentDTO s);

     StudentDTO convertToDto(StudentEntity s);

     List<StudentEntity> convertToEntities(List<StudentDTO> s);

     List<StudentDTO> convertToDtos(List<StudentEntity> s);

     StudentId studentIdDTOToStudentId(StudentIdDTO studentIdDTO);
}
