package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;

import java.util.List;

public interface StudentService {
    Long save (StudentDTO dto);
    Long update (StudentDTO dto);
    Boolean delete (Long id);
    List<StudentDTO> selectAll ();
}
