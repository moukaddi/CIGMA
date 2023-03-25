package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;

import java.util.List;

public interface StudentService {
    Long save (StudentDTO dto);
    Long update (StudentDTO dto);
    Boolean delete (StudentIdDTO idCompos);
    List<StudentDTO> selectAll ();
    StudentDTO selectById(StudentIdDTO idCompos);
}
