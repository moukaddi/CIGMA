package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("Start Methode Save");
        StudentDTO studentDTO = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return studentDTO.getStudentIdDTO().getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("Start Methode update");
        StudentDTO studentDTO = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return studentDTO.getStudentIdDTO().getId();
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("Start Methode delete");
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("Start Methode selectAll");
        return mapper.convertToDtos(repository.findAll());
    }
}
