package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.dtos.StudentIdDTO;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentRepository repository;

    private StudentMapper studentMapper= Mappers.getMapper(StudentMapper.class);

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("Start Methode Save");
        StudentDTO studentDTO = studentMapper.convertToDto(repository.save(studentMapper.convertToEntity(dto)));
        return studentDTO.getStudentId().getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("Start Methode update");
        StudentDTO studentDTO = studentMapper.convertToDto(repository.save(studentMapper.convertToEntity(dto)));
        return studentDTO.getStudentId().getId();
    }

    @Override
    public Boolean delete(StudentIdDTO idCompos) {
        LOGGER.debug("Start Methode delete");
        repository.deleteById(studentMapper.studentIdDTOToStudentId(idCompos));
        return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start Methode selectAll");
        return studentMapper.convertToDtos(repository.findAll());
    }

    @Override
    public StudentDTO selectById(StudentIdDTO idCompos) {
        return  studentMapper.convertToDto(repository.findById(studentMapper.studentIdDTOToStudentId(idCompos)).orElse(null));
    }
}
